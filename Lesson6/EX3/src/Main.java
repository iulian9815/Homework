import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int len = scaner.nextInt();
        int[] array =new int[len];
        int sum = 0;

        for (int i = 0; i < len; i++) {
            array[i] = scaner.nextInt();

        }
        int n = scaner.nextInt();
        for (int i = 0; i < len; i++) {
            if (array[i] >n) {
                sum += array[i];

            }

        }

        System.out.println(sum);
    }
}