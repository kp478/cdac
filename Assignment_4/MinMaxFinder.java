package Assignment_4;

public class MinMaxFinder {
    public static void main(String[] args) {
        // Create an integer array
        int[] array = {5, 4, 3, 9, 1, 7, 93};

        // Initialize variables to store minimum and maximum values
        int min = array[0];
        int max = array[0];

        // Iterate through the array to find minimum and maximum values
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }

        // Print the minimum and maximum values
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}
