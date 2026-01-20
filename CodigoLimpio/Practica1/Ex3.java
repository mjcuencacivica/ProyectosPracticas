package CodigoLimpio.Practica1;

public class Ex3 {

    private static final double TAX_LOW = 0.9;
    private static final double TAX_MEDIUM = 0.85;
    private static final double TAX_HIGH = 0.75;
    public static void main(String[] args) {
        double grossSalary = 30000.0;
        double netSalary;
        
        // Calculate net salary
        netSalary = calculateNetSalary(grossSalary);
        System.out.println("Net salary: " + netSalary + " euros");
    }

    public static double calculateNetSalary (double grossSalary){
        if (grossSalary <= 12000) {
            return grossSalary * TAX_LOW;  // 10% tax rate
        } else if (grossSalary <= 25000) {
            return grossSalary * TAX_MEDIUM;  // 15% tax rate
        }
        return grossSalary * TAX_HIGH;  // 25% tax rate
        
    }
}