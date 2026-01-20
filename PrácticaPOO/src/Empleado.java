public class Empleado extends Persona {
    double salario;
    String puesto;
 public Empleado(String nombre, int edad, String id, double salario, String puesto) {
        super(nombre, edad, id);   
        this.salario = salario; 
        this.puesto = puesto;   
    }
    public void mostrarDatos() {
        System.out.println(
            "Nombre: " + getNombre() +
            ", Edad: " + getEdad() +
            ", ID: " + getId() +
            ", Salario: " + salario +
            ", Puesto: " + puesto
        );
    }
}
