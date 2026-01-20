package CodigoLimpio.Practica2;

import java.util.ArrayList;
/**
 * Cosas a mejorar teniendo en cuenta clean code y principios SOLID serían:
 * - crear constantes globales para las notas, no se van a modificar en un futuro y son más claras que un valor 5 o 10
 * - añadir un nombre más descriptivo a los arrayList
 * - modificar la variable n por studentName para que quede claro lo que pide la función
 * - modificar los nombres de los métodos para que sean más descriptivos como addStudent, removeStudent, printResult, etc
 * - la lógica se repite varias veces, se podría simplificar
 * - métodos que mezclan cálculo con salida, cada método debería hacer una cosa, añadidos algunos comentarios en el código sobre ello
 * - comentarios innecesarios si se le da un buen nombre a la variable y/o método
 */

public class CourseManager {

    public static final int MIN_GRADE = 0;
    public static final int MAX_GRADE = 10;
    public static final int MIN_PASSING_GRADE = 5;

    private ArrayList<String> students = new ArrayList<>();  // students
    private ArrayList<Integer> grades = new ArrayList<>(); // grades
    private ArrayList<Boolean> passed = new ArrayList<>(); // passed
    private int sum = 0; // sum
    private double avg; // average
    
    // Function to add student
    public boolean addStudent(String studentName, int gr) {
        // check if grade is valid
        if (gr < MIN_GRADE || gr > MAX_GRADE) {//Podríamos crear un método tipo isPassed() y usarlo tanto en esta función
            // como en la de update sin duplicar código
            System.out.println("ERROR: Invalid grade. Must be between 0 and 10.");
            return false; // end
        }
        
        students.add(studentName);
        grades.add(gr);
        if (gr >= MIN_PASSING_GRADE) {
            passed.add(true);
        } else {
            passed.add(false);
        }
        
        // recalculate average
        sum = sum + gr;
        avg = (double) sum / grades.size();
        
        System.out.println("Student added: " + studentName + " with grade " + gr);
        return true; // success
    }
    
    // Function to remove student
    public boolean removeStudent(String n) {
        int i = students.indexOf(n);
        
        if (i != -1) {
            int gr = grades.get(i);
            students.remove(i);
            grades.remove(i);
            passed.remove(i);
            
            // recalculate average
            sum = sum - gr;
            if (grades.size() > 0) {
                avg = (double) sum / grades.size();
            } else {
                avg = 0.0;
            }
            
            System.out.println("Student removed: " + n);
            return true; // success
        } else {
            System.out.println("ERROR: Student not found.");
            return false; // failure
        }
    }
    
    // get results
    public void printResults() {//Podríamos sacar de aquí 3 métodos independientes para que el método solo imprima
        System.out.println("COURSE RESULTS");
        System.out.println("---------------");
        System.out.println("Number of students: " + students.size());
        System.out.println("Average grade: " + avg);
        
        // get number of students who passed
        int numPassed = 0;
        for (int i = 0; i < passed.size(); i++) {
            if (passed.get(i) == true) {
                numPassed++;
            }
        }
        
        // get pass percentage
        double percentage = (double) numPassed / passed.size() * 100;
        System.out.println("Passed: " + numPassed + " (" + percentage + "%)");
        
        // get best student
        if (students.size() > 0) {
            int maxIndex = 0;
            int maxGrade = grades.get(0);
            
            for (int i = 1; i < grades.size(); i++) {
                if (grades.get(i) > maxGrade) {
                    maxIndex = i;
                    maxGrade = grades.get(i);
                }
            }
            
            System.out.println("Best student: " + students.get(maxIndex) + " with grade " + maxGrade);
        }
        
        // print students
        System.out.println("\nSTUDENT LIST:");
        System.out.println("---------------");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i) + ": " + grades.get(i) + " - " + (passed.get(i) ? "PASSED" : "FAILED"));
        }
    }
    
    // check if a student is present
    public boolean check(String studentName) {
        return students.contains(studentName);
    }
    
    // update student's grade
    public boolean updateGrade(String studentName, int gr) {
        // check if grade is valid
        if (gr < MIN_GRADE || gr > MAX_GRADE) {
            System.out.println("ERROR: Invalid grade. Must be between 0 and 10.");
            return false;
        }
        
        int i = students.indexOf(studentName);
        
        if (i != -1) {
            int oldGrade = grades.get(i);
            grades.set(i, gr);
            passed.set(i, gr >= MIN_PASSING_GRADE);
            
            // update average
            sum = sum - oldGrade + gr;
            avg = (double) sum / grades.size();
            
            System.out.println("Grade updated for " + studentName + ": " + oldGrade + " -> " + gr);
            return true;
        } else {
            System.out.println("ERROR: Student not found.");
            return false;
        }
    }
    
    // get pass statistics
    public void printPassStatistics() {
        if (students.size() == 0) {
            System.out.println("No students in the course.");
            return;
        }
        
        // Initialize counters for different grade ranges
        int range0_2 = 0;
        int range3_4 = 0;
        int range5_6 = 0;
        int range7_8 = 0;
        int range9_10 = 0;
        
        // Count students in each grade range
        for (int grade : grades) {
            if (grade >= 0 && grade <= 2) {
                range0_2++;
            } else if (grade <= 4) {
                range3_4++;
            } else if (grade <= 6) {
                range5_6++;
            } else if (grade <= 8) {
                range7_8++;
            } else {
                range9_10++;
            }
        }
        
        System.out.println("GRADE DISTRIBUTION");
        System.out.println("------------------");
        System.out.println("0-2: " + range0_2 + " students");
        System.out.println("3-4: " + range3_4 + " students");
        System.out.println("5-6: " + range5_6 + " students");
        System.out.println("7-8: " + range7_8 + " students");
        System.out.println("9-10: " + range9_10 + " students");
    }
    
    // main program
    public static void main(String[] args) {
        // Create course manager
        CourseManager cm = new CourseManager();
        
        // Add some students
        cm.addStudent("John Smith", 7);
        cm.addStudent("Mary Johnson", 9);
        cm.addStudent("Paul Williams", 4);
        cm.addStudent("Sarah Brown", 8);
        cm.addStudent("Mike Davis", 5);
        
        // Print results
        cm.printResults();
        
        // Update grade
        cm.updateGrade("Paul Williams", 6);
        
        // Print results again
        cm.printResults();
        
        // Print statistics
        cm.printPassStatistics();
    }
}