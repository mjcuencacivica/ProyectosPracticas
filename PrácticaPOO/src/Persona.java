
public class Persona {
    private String nombre;
    private int edad;
    public static int contador = 0;
    private final String id;

    public Persona(String nombre, int edad, String id) {
        this.nombre = nombre;
        this.edad = edad;
        this.id = id;
        contador++;
    }

    void saludar() {
        System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años.");
    }
    public String getNombre(){ return nombre; }
    public void setNombre(String nombre){ this.nombre = nombre; }
    public int getEdad(){ return edad; }
    public void setEdad(int edad){ if(edad>0) this.edad=edad; }
    public String getId(){ return id; }

}