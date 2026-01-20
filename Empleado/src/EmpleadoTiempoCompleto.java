package Empleado.src;

public class EmpleadoTiempoCompleto extends Empleado{

    private double salarioMensual;

    public EmpleadoTiempoCompleto(String nombre, String dni, String puesto,
            double jornada, double salarioMensual) {
        super(nombre, dni, puesto, jornada, "Jornada completa");
        this.salarioMensual = salarioMensual;
    }

    @Override
    public double calcularSalario() {
    double jornadaBase = 40; // horas estándar
    return (jornada / jornadaBase) * salarioMensual;
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
                        "\nSalario mensual: " + calcularSalario());
    }
    
}
