import java.util.List;

public interface CourseDAO {
    List<Course> getAllCourses();

    Course getCourseByName(String name);

    void addCourse(Course course);

    void removeCourse(Course course);
}
