import java.util.ArrayList;
import java.util.List;

public class CourseDAOImpl implements CourseDAO {

    private List<Course> courses = new ArrayList<>();

    @Override
    public List<Course> getAllCourses() {
        return courses;
    }

    @Override
    public Course getCourseByName(String name) {
        for (Course c : courses) {
            if (c.getName().equalsIgnoreCase(name)) {
                return c;
            }
        }
        return null;
    }

    @Override
    public void addCourse(Course course) {
        courses.add(course);
    }

    @Override
    public void removeCourse(Course course) {
        courses.remove(course);
    }
}
