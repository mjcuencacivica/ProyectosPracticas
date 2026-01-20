package Empleado.src;

public abstract class Empleado {
    protected String nombre;
    protected String dni;
    protected String puesto;
    protected double jornada;
    protected String contrato;
    
    public String getNombre() {return nombre;}
    public String getDni() {return dni;}
    public String getPuesto() {return puesto;}
    public double getJornada() {return jornada;}
    public String getContrato() {return contrato;}

    public void setPuesto(String puesto){this.puesto = puesto;}
    public void setJornada(double jornada){this.jornada = jornada;}
    public void setContrato(String contrato){this.contrato = contrato;}

    public Empleado(String nombre, String dni, String puesto, double jornada, String contrato) {
        this.nombre = nombre;
        this.dni = dni;
        this.puesto = puesto;
        this.jornada = jornada;
        this.contrato = contrato;
    }

    // Métodos abstractos, dependerá del tipo de empleado
    public abstract double calcularSalario();

    public abstract void mostrarDatos();
}
