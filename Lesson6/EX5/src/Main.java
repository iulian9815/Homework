import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int val = scanner.nextInt();
        int [][] array = new int[val][val];
        for (int i = 0; i < val; i++) {
            for (int j = 0; j < val; j++) {
              int temp = i-j;
              if (temp<0 )
                  temp= -temp;
              int a = temp;
              array[i][j]=a;

            }

        }
        for (int[] ints : array) {
            for (int temp : ints) {
                System.out.print(temp+" ");
            }
            System.out.println();
        }
    }
}