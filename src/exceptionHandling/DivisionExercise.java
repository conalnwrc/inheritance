package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionExercise {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            // Prompt the user to enter two integers
            System.out.print("Enter the first integer: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the second integer: ");
            int num2 = scanner.nextInt();

            // Perform division and handle potential exceptions
            int result = num1 / num2;
            System.out.println("Result of division: " + result);

        } catch (NumberFormatException e) {
            System.out.println("Invalid input: Please enter integers only.");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input: no letters.");
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}

