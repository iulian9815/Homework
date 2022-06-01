import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("How many mines do you want on the field?");
        int number = scanner.nextInt();
        char[][] array = new char[9][9];
        char b = 'X';

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                char a = '.';
                array[i][j] = a;
            }
        }

        for (int i = 0; i < number+1; i++) {
            int w = random.nextInt(9);
            int q = random.nextInt(9);
            if (array[q][w]=='.')
            array[q][w] = b;

        }
        for (char[] chars : array) {
            for (char a : chars) {
                System.out.print(a + " ");
            }
            System.out.println();
        }

    }
}