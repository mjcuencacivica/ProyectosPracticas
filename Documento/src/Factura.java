package Documento.src;

import java.time.LocalDate;

public class Factura implements Imprimible {

    private int numero;
    private double total;
    private LocalDate fecha;

    public int getNumero(){return numero;}
    public double getTotal(){return total;}
    public LocalDate getFecha() {return fecha;}

    public void setNumero (int numero){this.numero = numero;}
    public void setTotal(double total){this.total = total;}
    public void setFecha(LocalDate fecha){this.fecha = fecha;}

    public Factura(int numero, double total, LocalDate fecha) {
        this.numero = numero;
        this.total = total;
        this.fecha = fecha;
    }

    @Override
    public void imprimir() {
        System.out.println("Factura nº: " + numero);
        System.out.println("Total: " + total + " €");
        System.out.println("Fecha: " + fecha);

    }
    
}
