package Banco.src;

public class CuentaBancaria {
    
    private final String numCuenta;
    private String dni;
    private double saldo;

    public CuentaBancaria (String numCuenta, String dni, double saldo){
        this.numCuenta = numCuenta;
        this.dni = dni;
        this.saldo = saldo;
    }

    public String getNumCuenta() {return numCuenta;}
    public String getDni() {return dni;}
    public double getSaldo() {return saldo;}

    public void depositar(double cantidad){
        if(cantidad>0){
            saldo +=cantidad;
            System.out.println("Saldo actual: " + saldo);
        }
    }
    public void retirar(double cantidad){
        if(cantidad>0 && cantidad<=saldo){
            saldo -= cantidad;
            System.out.println("Saldo actual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void mostrarSaldo(){
        System.out.println("Número de cuenta: " + getNumCuenta() + "\nDNI: " + getDni() + "\nSaldo total: " + getSaldo());
    }

}
