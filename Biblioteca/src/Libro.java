package Biblioteca.src;

public class Libro {
    private String titulo;
    private String autor;
    private boolean prestado;

    public Libro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        this.prestado = false;
    }

    public boolean isPrestado(){ return prestado; }
    public void prestar(){ prestado=true; }
    public void devolver(){ prestado=false; }

    public void mostrarInfo(){
        System.out.println(titulo+" de "+autor+(prestado?" (Prestado)":" (Disponible)"));
    }
}
