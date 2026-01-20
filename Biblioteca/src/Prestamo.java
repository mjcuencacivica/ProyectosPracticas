package Biblioteca.src;

public class Prestamo {
    private Libro libro;
    private Usuario usuario;

    public Prestamo(Libro libro, Usuario usuario){
        this.libro = libro; 
        this.usuario = usuario;
        libro.prestar();
    }

    public void finalizar(){ libro.devolver(); }
}
