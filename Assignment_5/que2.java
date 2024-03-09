package Assignment_5;

public class que2 {
    public static void main(String[] args) {
        int N = 5;

        for (int i = 0; i < N; i++) {
            for (int j = N; j > i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
