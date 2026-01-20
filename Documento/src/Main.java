package Documento.src;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        
        Documento doc1 = new Documento("Plantilla CV", "Cv completo de Ana María La Justicia.", "María José", LocalDate.of(2026, 1, 16));
        Documento doc2 = new Documento("Clases y métodos POO", "Clases y métodos de la programación orientada a objetos.", "Ana", LocalDate.of(2026, 1, 16));
        Documento doc3 = new Documento("Polimorfismo", "El polimorfismo en Java es un concepto clave de la POO que permite que objetos de diferentes clases respondan al mismo método de formas distintas, logrando \"muchas formas\" para una misma llamada;", "Código facilito", LocalDate.of(2022, 4, 18));
        Factura fac1 = new Factura(1, 1468.95, LocalDate.of(2026, 1, 16));
        Factura fac2 = new Factura(2, 2480, LocalDate.of(2026, 1, 12));
        Factura fac3 = new Factura(3, 1287.43, LocalDate.of(2026, 1, 5));

        System.out.println("El autor de " + doc1.getTitulo() + " es " + doc1.getAutor());

        doc2.setFecha(LocalDate.of(2025,4,12));

        Documento [] documentos = {doc1, doc2, doc3};
        Factura [] facturas = {fac1, fac2, fac3};

        for(Documento documento: documentos){
            documento.imprimir();
        }

        for(Factura factura: facturas){
            factura.imprimir();
        }


    }
    
}
