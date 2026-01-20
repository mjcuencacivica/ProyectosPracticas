
public class Main {
    public static void main(String[] args) {

        Persona p1 = new Persona ("María José", 32, "1");
        p1.saludar();
        Persona p2 = new Persona ("Ana", 25, "2");

        System.out.println("Herencia: ");

        Empleado e1 = new Empleado(p1.getNombre(), p1.getEdad(), p1.getId(), 40000, "Desarrollador");
        e1.mostrarDatos();

        Empleado e2 = new Empleado(p2.getNombre(), p2.getEdad(), p2.getId(), 35000, "Desarrollador");
        e2.mostrarDatos();    

        System.out.println("Polimofirmos y sobreescritura:");

        Animal animal1 = new Animal();
        animal1.sonido();
        animal1.comer();
        Perro perro1 = new Perro();
        perro1.sonido();
        perro1.comer();
        Vaca vaca1 = new Vaca();
        vaca1.sonido();
        vaca1.comer();

        System.out.println("Sobrecarga de método:");
        Calculadora total = new Calculadora();
        System.out.println("Total enteros: " + total.sumar(3, 5));
        System.out.println("Total decimales: " + total.sumar(3.2, 5.7));
    
        System.out.println("Abstracción e interfaces:");
        Volador pajaro = new Pajaro();
        Volador avion = new Avion();
        
        pajaro.volar();
        avion.volar();
    
    }
}

 