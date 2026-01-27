public class CourseView {

    public void showCourse(Course course) {
        System.out.println("Curso: " + course.getName());
        System.out.println("Profesor/a: " + course.getTeacher());
        System.out.println("Horas: " + course.getHours());
        System.out.println("Plazas disponibles: " + course.getAvailableSlots());
    }

    public void showMessage(String message) {
        System.out.println(message);
    }
}
