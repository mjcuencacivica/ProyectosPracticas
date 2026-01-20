package Empleado.src;

public class Main {

    public static void main(String[] args) {

        Empleado empleado1 = new EmpleadoTiempoCompleto("Ana", "12345678A", "Programadora", 40, 2000.89);
        Empleado empleado2 = new EmpleadoTiempoCompleto("Luis", "87654321B", "Diseñador", 40, 2300.12);
        Empleado empleado3 = new EmpleadoTiempoCompleto("Javier", "21458796K", "Técnico de sistemas", 40, 1800.53);
        Empleado empleado4 = new EmpleadoFreelance("María", "23589745M", "Data Engineer", 120, 30.15);
        Empleado empleado5 = new EmpleadoFreelance("Francisco", "36879542G", "Data Governance", 110, 48);

        System.out.println("Salario mensual: " + empleado2.calcularSalario());

        Empleado[] empleadosPlantilla = { empleado1, empleado2, empleado3 };
        Empleado[] empleadosFreelance = { empleado4, empleado5 };

        System.out.println("Listado de empleados en nómina: ");
        for (Empleado empleado : empleadosPlantilla) {
            empleado.mostrarDatos();
        }
        System.out.println("-------------------------------------------");

        System.out.println("Listado de freelancers: ");
        for (Empleado empleado : empleadosFreelance) {
            empleado.mostrarDatos();
        }

        empleado3.setJornada(30);
        System.out.println("Empleado: " + empleado3.getNombre() + " Salario mensual: " + empleado3.calcularSalario() + " € al mes.");

        empleado5.setJornada(90);
        System.out.println("Freelance: " + empleado5.getNombre() + " Coste mensual: " + empleado5.calcularSalario() + " € al mes.");

    }

}
