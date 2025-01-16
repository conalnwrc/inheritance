package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionExercise2 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter number 1");
            //int num1 = Integer.parseInt(scanner.nextLine());
            int num1 = scanner.nextInt();

            System.out.println("Enter number 2");
            //int num2 = Integer.parseInt(scanner.nextLine());
            int num2 = scanner.nextInt();

            int result = divideTwoNumbers(num1, num2);
            System.out.println("Result of division: " + result);

        } catch (NumberFormatException e) {
            System.out.println("Invalid input, please enter Integers");
        } catch (InputMismatchException e) {
            System.out.println("I'm in input mismatch...Please enter Integers");
        } catch (ArithmeticException e) {
            System.out.println("Division by zero not allowed");
        } finally {
            scanner.close();
        }
    }

    public static int divideTwoNumbers(int num1, int num2) {
        return num1 / num2;
    }
}
