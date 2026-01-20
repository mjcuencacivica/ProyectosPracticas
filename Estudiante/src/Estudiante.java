package Estudiante.src;

public class Estudiante {
    private String nombre;
    private String dni;
    private String carrera;

    public Estudiante (String nombre, String dni, String carrera){
        this.nombre = nombre;
        this.dni = dni;
        this.carrera = carrera;
    }

    public String getNombre() {return nombre;}
    public String getDni() {return dni;}
    public String getCarrera() {return carrera;}

    public void setCarrera(String carrera){this.carrera = carrera;}   

     public void mostrarDatos() {
        System.out.println(
            "Nombre: " + nombre +
            ", DNI: " + dni +
            ", Carrera: " + carrera
        );
    
    }
}
