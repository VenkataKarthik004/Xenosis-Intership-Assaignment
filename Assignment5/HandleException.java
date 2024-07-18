package Assignment5;

import java.util.Scanner;

public class HandleException {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fixedNumber = 10;

        try {
            System.out.print("Enter a UserInput Number: ");
            int userInput = sc.nextInt();

            // Attempt to divide the fixed number by the user-provided number
            int result = fixedNumber / userInput;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handle division by zero exception
            System.out.println("Error: Division by zero is not allowed.");
        } catch (Exception e) {
            // Handle any other exceptions
            System.out.println("Error: An unexpected error occurred.");
        } finally {
            // This block will always be executed
            System.out.println("Finally block executed.");
        }
    }
}

