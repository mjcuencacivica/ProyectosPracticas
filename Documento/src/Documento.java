package Documento.src;

import java.time.LocalDate;

public class Documento implements Imprimible{

    private String titulo;
    private String contenido;
    private String autor;
    private LocalDate fecha;

    public String getTitulo(){return titulo;}
    public String getContenido(){return contenido;}
    public String getAutor(){return autor;}
    public LocalDate getFecha() {return fecha;}

    public void setTitulo(String titulo){this.titulo = titulo;}
    public void setContenido(String contenido){this.contenido = contenido;}
    public void setAutor(String autor){this.autor = autor;}
    public void setFecha(LocalDate fecha){this.fecha = fecha;}


    public Documento(String titulo, String contenido, String autor, LocalDate fecha) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.autor = autor;
        this.fecha = fecha;
    }

    @Override
    public void imprimir() {
        System.out.println("Documento: " + titulo);
        System.out.println("Fecha: " + fecha);
        System.out.println(contenido);
    }


}