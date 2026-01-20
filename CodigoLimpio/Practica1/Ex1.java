package CodigoLimpio.Practica1;

public class Ex1 {
    public static void main(String[] args) {
        int days = 5; 
        double price = 10.99;  
        
        double total = calculateTotalPrice(days, price);
        printTotalPrice(total);
    
    }

    private static double calculateTotalPrice(int days, double pricePerDay) {
        return days * pricePerDay;
    }

    private static void printTotalPrice(double total) {
        System.out.println("Total price is: " + total + " euros");
    }

}