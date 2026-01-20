package Biblioteca.src;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> libros = new ArrayList<>();

    public void agregarLibro(Libro libro){ libros.add(libro); }
    public void mostrarLibros(){ for(Libro l:libros) l.mostrarInfo(); }
}
