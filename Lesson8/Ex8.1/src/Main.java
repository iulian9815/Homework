import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        sumInRange( a, b);

    }
    public static void sumInRange (int a, int b) {

        int sum = 0;
        for (int i = a; i < b; i++) {
            sum += i;

        }
        System.out.println(sum);
    }

        }

