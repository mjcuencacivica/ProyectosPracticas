package CodigoLimpio.Practica1;

public class Ex4 {
    public static void main(String[] args) {
        // Calculate area of several rectangles
        double width1 = 5.0;
        double height1 = 3.0;
        
        System.out.println("Area of rectangle 1: " + calculateRectangleArea(width1, height1));
        
        double width2 = 7.0;
        double height2 = 2.0;
        
        System.out.println("Area of rectangle 2: " + calculateRectangleArea(width2, height2));
        
        double width3 = 10.0;
        double height3 = 4.0;
        
        System.out.println("Area of rectangle 3: " + calculateRectangleArea(width3, height3));
    }

    public static double calculateRectangleArea(double width, double height){
        return width*height;
    }
}