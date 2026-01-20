package Estudiante.src;

public class Main {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("María", "79854523L", "Bellas Artes");
        Estudiante e2 = new Estudiante("Elena", "34546756T", "Ciencias Ambientales");
        Estudiante e3 = new Estudiante("Julio", "34545256Y", "Recursos Humanos");
        Estudiante e4 = new Estudiante("Marina", "39546756R", "Bellas Artes");
        Estudiante e5 = new Estudiante("Alberto", "34326756Z", "Derecho");

        Universidad universidad1 = new Universidad("UMA");
        Universidad universidad2 = new Universidad("UGR");

        universidad1.agregarEstudiantes(e1);
        universidad1.agregarEstudiantes(e2);
        universidad1.agregarEstudiantes(e3);
        universidad2.agregarEstudiantes(e4);
        universidad2.agregarEstudiantes(e5);

        universidad1.mostrarEstudiantes();
        universidad2.mostrarEstudiantes();
    }
    
}
