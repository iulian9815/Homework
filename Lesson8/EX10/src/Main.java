import java.util.Scanner;
public class Main {
    public static long sum(int s) {
        long result = 1;
        if (s == 1 || s == 0) {
            return result;
        }
        result = s + sum(s-1);
        return result;
    }
    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long sum = sum(scanner.nextInt());
        System.out.println(sum);
    }
}