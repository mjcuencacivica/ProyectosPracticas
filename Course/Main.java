public class Main {
    public static void main(String[] args) {

        // DAO
        CourseDAO courseDAO = new CourseDAOImpl();

        // Vista
        CourseView view = new CourseView();

        // Crear cursos y añadirlos a DAO
        Course course1 = new Course("Alfarería avanzada", "Javier López", 20, 15);
        Course course2 = new Course("Prevención de riesgos laborales", "Julio García", 60, 30);
        Course course3 = new Course("Manipulador de alimentos", "Armando Segura", 30, 20);

        courseDAO.addCourse(course1);
        courseDAO.addCourse(course2);
        courseDAO.addCourse(course3);

        // Controladores por curso
        CourseController controller1 = new CourseController(courseDAO.getCourseByName("Alfarería avanzada"), view);
        CourseController controller2 = new CourseController(courseDAO.getCourseByName("Prevención de riesgos laborales"), view);

        // Usar el controlador
        controller1.displayCourse();
        for (int i = 0; i < 5; i++) controller1.enrollStudent(); // Inscribimos 5 alumnos
        controller1.displayCourse();

        controller2.displayCourse();
        for (int i = 0; i < 3; i++) controller2.enrollStudent();
        controller2.displayCourse();

        // Listar todos los cursos usando DAO
        System.out.println("Listado completo de cursos:");
        for (Course c : courseDAO.getAllCourses()) {
            view.showCourse(c);
        }
    }
}
