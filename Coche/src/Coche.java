package Coche.src;

public class Coche {
    public enum TipoCoche {
        GASOLINA,
        DIESEL,
        HIBRIDO
    }

    private String marca;
    private String modelo;
    private String color;
    private String matricula;
    private int puertas;
    private int potencia;
    private TipoCoche tipo;

    public Coche (String marca, String modelo, String color, String matricula, int puertas,
        int potencia, TipoCoche tipo){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.matricula = matricula;
        this.puertas = puertas;
        this.potencia = potencia;
        this.tipo = tipo;
    }

    public String getMarca() {return marca;}
    public String getModelo() {return modelo;}
    public String getColor() {return color;}
    public String getMatricula() {return matricula;}
    public int getPuertas() {return puertas;}
    public int getPotencia() {return potencia;}
    public TipoCoche getTipo() { return tipo;}
    public void setColor(String color) { this.color = color; }

    public void mostrarInfo() {
        System.out.println("Datos del vehículo: \n" + "Marca: " + marca + "\nModelo: " + modelo + "\nColor: " + color + 
        "\nMatrícula: " + matricula + "\nPuertas: " + puertas + "\nPotencia: " + potencia + " CV \nTipo: " + tipo);
    }
    
}
