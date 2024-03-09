package Assignment_5;

import java.util.Scanner;

public class que_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Calculate sum
        int sum = 0;
        for (int num : array) {
            sum += num;
        }

        // Print sum
        System.out.println("Sum of all elements: " + sum);

        scanner.close();
    }
}
