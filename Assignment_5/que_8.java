package Assignment_5;

import java.util.ArrayList;
import java.util.Scanner;

public class que_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Original array: ");
        printArray(array);

        int[] uniqueArray = removeDuplicates(array);

        System.out.println("\nArray after removing duplicates:");
        printArray(uniqueArray);
        
        scanner.close();
    }

    static int[] removeDuplicates(int[] array) {
        ArrayList<Integer> uniqueList = new ArrayList<>();
        for (int num : array) {
            if (!uniqueList.contains(num)) {
                uniqueList.add(num);
            }
        }

        int[] uniqueArray = new int[uniqueList.size()];
        for (int i = 0; i < uniqueList.size(); i++) {
            uniqueArray[i] = uniqueList.get(i);
        }
        return uniqueArray;
    }

    static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
