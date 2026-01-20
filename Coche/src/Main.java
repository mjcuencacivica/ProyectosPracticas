package Coche.src;

public class Main {
        public static void main(String[] args) {


    Coche c1 = new Coche("Toyota", "Corolla", "Blanco", "1234ABC", 4, 140, Coche.TipoCoche.GASOLINA);
    Coche c2 = new Coche("BMW", "Serie 1", "Blanco", "7676HPM", 3, 116, Coche.TipoCoche.DIESEL);
    Coche c3 = new Coche("Hiunday", "i30N", "Rojo", "2526NGH", 5, 120, Coche.TipoCoche.HIBRIDO);

    c1.mostrarInfo();
    c2.mostrarInfo();
    c3.mostrarInfo();

 }
}
