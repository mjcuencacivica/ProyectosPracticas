public class CourseController {

    private Course course;
    private CourseView view;

    public CourseController(Course course, CourseView view) {
        this.course = course;
        this.view = view;
    }

    public void displayCourse() {
        view.showCourse(course);
    }

    public void enrollStudent() {
        boolean enrolled = course.enrollStudent();

        if (enrolled) {
            view.showMessage("Alumno inscrito correctamente.");
        } else {
            view.showMessage("No hay plazas disponibles.");
        }
    }
}
