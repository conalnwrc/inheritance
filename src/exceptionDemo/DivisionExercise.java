package exceptionDemo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionExercise {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter the first integer");
            int num1 = scanner.nextInt();

            System.out.println("Enter the second integer");
            int num2 = scanner.nextInt();

            int result = num1 / num2;
            System.out.println("Result of division: " + result);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input: Please enter integers only.");
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
        finally {
            scanner.close();
        }
    }
}
