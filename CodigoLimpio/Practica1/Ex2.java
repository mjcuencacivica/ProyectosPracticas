package CodigoLimpio.Practica1;

public class Ex2 {

    private static final int ADULT_AGE = 18;
    private static final double BASE_PRICE = 100.0;
    private static final double STUDENT_DISCOUNT = 0.8;

    public static void main(String[] args) {
        String firstName = "Anna";
        String lastName = "Garcia";
        int age = 28;
        boolean student = true;

        // Display user information
        displayUserInformation(firstName, lastName, age, student);

        // Check if user is an adult
        checkAdult(age);

        // Calculate price with discount if student
        System.out.println("Price to pay: " + calculatePrice(student) + " euros");
    }

    public static void displayUserInformation(String firstName, String lastName, int age, boolean student) {
        System.out.println("User information:" +
                "\nFirst name: " + firstName +
                "\nLast name: " + lastName +
                "\nAge: " + age +
                "\nIs student: " + (student ? "Yes" : "No"));
    }

    public static void checkAdult(int age) {
        if (age >= ADULT_AGE) {
            System.out.println("Is an adult");
        } else {
            System.out.println("Is a minor");
        }
    }

    public static double calculatePrice(boolean student) {
        if (student) {
            return BASE_PRICE * STUDENT_DISCOUNT; // 20% discount
        } else {
            return BASE_PRICE;
        }
    }

}