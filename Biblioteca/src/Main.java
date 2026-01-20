package Biblioteca.src;

public class Main {
    public static void main(String[] args){
        Libro l1 = new Libro("1984","George Orwell");
        Libro l2 = new Libro("El Principito","A. Saint-Exupéry");
        Libro l3 = new Libro("Cien años de soledad","Gabriel García Márquez");
        Libro l4 = new Libro("Orgullo y prejuicio","Jane Austen");
        Libro l5 = new Libro("Don Quijote de la Mancha","Miguel de Cervantes");
        Usuario u1 = new Usuario("Ana");
        Usuario u2 = new Usuario("Jorge");

        Biblioteca b = new Biblioteca();
        b.agregarLibro(l1); 
        b.agregarLibro(l2); 
        b.agregarLibro(l3);
        b.agregarLibro(l4);
        b.agregarLibro(l5);

        System.out.println("Listado de libros: ");
        Prestamo p1 = new Prestamo(l1,u1);
        Prestamo p2 = new Prestamo(l3,u1);
        Prestamo p3 = new Prestamo(l5,u2);
        p1.finalizar();
        p2.finalizar();
        p3.finalizar();
        b.mostrarLibros();
    }
    
}
