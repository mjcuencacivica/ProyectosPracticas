package Banco.src;

public class Main {
    public static void main(String[] args) {
    CuentaBancaria c1 = new CuentaBancaria("788956", "56748390J", 5000);
    CuentaBancaria c2 = new CuentaBancaria("235874", "12587965L", 300);
    CuentaBancaria c3 = new CuentaBancaria("785687", "12345678P", 1200.59);

    c1.depositar(300);
    c1.retirar(1459.87);
    c2.depositar(1500.36);
    c3.depositar(1540.69);
    c3.retirar(238.97);

    c1.mostrarSaldo();
    c2.mostrarSaldo();
    c3.mostrarSaldo();
    }

}
