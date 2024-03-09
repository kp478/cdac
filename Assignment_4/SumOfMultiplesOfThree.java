package Assignment_4;

import java.util.Scanner;

public class SumOfMultiplesOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        scanner.close();

        int sum = 0;
        for (int i = 0; i <= n; i++) {
            int t = 2 * i;
            if (t % 3 == 0) {
                sum += t;
            }
        }
        
        System.out.println("Sum of multiples of 3 in the sequence: " + sum);
    }
}
