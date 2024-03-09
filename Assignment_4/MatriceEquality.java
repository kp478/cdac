package Assignment_4;

public class MatriceEquality {
    public static void main(String[] args) {
        // Define matrices
        int[][] matrix1 = {{1, 2}, {3, 4}};
        int[][] matrix2 = {{1, 2}, {3, 4}};

        // Check equality
        boolean isEqual = true;
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                if (matrix1[i][j] != matrix2[i][j]) {
                    isEqual = false;
                    break;
                }
            }
        }

        // Print result
        if (isEqual) {
            System.out.println("Matrices are equal");
        } else {
            System.out.println("Matrices are not equal");
        }
    }
}
