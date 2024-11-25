import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class MathOperations {

    // Method to multiply two numbers
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Method to divide two numbers
    public static double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Division by zero is not allowed.");
            return 0;
        }
        return (double) a / b;
    }

    // Method to subtract two numbers
    public static int subtract(int a, int b) {
        return a - b;
    }

    // Method to display prime numbers in a range
    public static void displayPrimes(int start, int end) {
        System.out.println("Prime numbers between " + start + " and " + end + ":");
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // Helper method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            // Input for multiplication
            System.out.print("Enter two numbers to multiply: ");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            System.out.println("Multiplication result: " + multiply(num1, num2));

            // Input for division
            System.out.print("Enter two numbers to divide (numerator and denominator): ");
            int numerator = scanner.nextInt();
            int denominator = scanner.nextInt();
            System.out.println("Division result: " + divide(numerator, denominator));

            // Input for subtraction
            System.out.print("Enter two numbers to subtract (minuend and subtrahend): ");
            int minuend = scanner.nextInt();
            int subtrahend = scanner.nextInt();
            System.out.println("Subtraction result: " + subtract(minuend, subtrahend));

            // Input for prime numbers range
            System.out.print("Enter the range to display prime numbers (start and end): ");
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            displayPrimes(start, end);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        } catch (NoSuchElementException e) {
            System.out.println("No input available.");
        } finally {
            scanner.close();
        }
    }
}

