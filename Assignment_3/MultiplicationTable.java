package Assignment_3;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String args[]) {
        // Create a scanner object
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the input
        int number = scanner.nextInt();

        // Display the multiplication table of the entered number
        System.out.println("Multiplication Table of " + number + ":");
        for(int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }

        // Close the scanner
        scanner.close();
    }
}
