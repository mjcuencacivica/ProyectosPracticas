package Empleado.src;

public class EmpleadoFreelance extends Empleado {

    private double precioHora;

    public EmpleadoFreelance(String nombre, String dni, String puesto,
            double jornada, double precioHora) {
        super(nombre, dni, puesto, jornada, "Freelance");
        this.precioHora = precioHora;
    }

    @Override
    public double calcularSalario() {
        return jornada * precioHora;
    }

    @Override
    public void mostrarDatos() {
        System.out.println(
                "Datos del empleado:" +
                        "\nNombre: " + getNombre() +
                        "\nDNI: " + getDni() +
                        "\nPuesto: " + getPuesto() +
                        "\nJornada: " + getJornada() +
                        "\nTipo de contrato: " + getContrato() +
                        "\nPrecio hora: " + precioHora +
                        "\nCoste mensual: " + calcularSalario());
    }
}
