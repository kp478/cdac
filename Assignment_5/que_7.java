package Assignment_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class que_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the first array: ");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];
        System.out.println("Enter elements of the first array:");
        for (int i = 0; i < size1; i++) {
            array1[i] = scanner.nextInt();
        }

        System.out.print("Enter the size of the second array: ");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];
        System.out.println("Enter elements of the second array:");
        for (int i = 0; i < size2; i++) {
            array2[i] = scanner.nextInt();
        }

        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));

        ArrayList<Integer> commonElements = findCommonElements(array1, array2);

        System.out.println("Common elements: " + commonElements);
        
        scanner.close();
    }

    static ArrayList<Integer> findCommonElements(int[] arr1, int[] arr2) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int num : arr1) {
            if (contains(arr2, num) && !result.contains(num)) {
                result.add(num);
            }
        }

        return result;
    }

    static boolean contains(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }
}
