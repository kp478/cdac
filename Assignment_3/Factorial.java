package Assignment_3;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Calculate factorial using a while loop
        int factorial = 1;
        int i = 1;
        while (i <= number) {
            factorial *= i;
            i++;
        }

        // Display the factorial of the entered number
        System.out.println("Factorial of " + number + " is: " + factorial);

        // Close the scanner
        scanner.close();
    }
}
