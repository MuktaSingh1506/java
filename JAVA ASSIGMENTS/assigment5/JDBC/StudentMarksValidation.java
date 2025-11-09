package assigment5.JDBC;

import java.util.Scanner;

class NegativeMarksException extends Exception {
    public NegativeMarksException(String message) {
        super(message);
    }
}

class MarksOutOfRangeException extends Exception {
    public MarksOutOfRangeException(String message) {
        super(message);
    }
}

public class StudentMarksValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter student marks (0 - 100): ");
            int marks = sc.nextInt();

            if (marks < 0) {
                throw new NegativeMarksException("Marks cannot be negative!");
            } else if (marks > 100) {
                throw new MarksOutOfRangeException("Marks cannot exceed 100!");
            } else {
                System.out.println(" Marks accepted: " + marks);
            }

        } catch (NegativeMarksException e) {
            System.out.println(" Error: " + e.getMessage());
        } catch (MarksOutOfRangeException e) {
            System.out.println(" Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println(" Invalid input! Please enter a valid number.");
        } finally {
            sc.close();
            System.out.println("Program ended.");
        }
    }
}

