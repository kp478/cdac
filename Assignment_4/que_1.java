package Assignment_4;

public class que_1 {
    public static void main(String[] args) {
        int[] array = {5,4,3,9,1,7,8};

        int sum = 0;
        for (int num : array) {
            sum += num;
        }

        double average = (double) sum / array.length;

        System.out.println("Average: " + average);
    }
}
