import java.util.Scanner;

public class Main {
    public static int extractInt(double d) {
        int i = (int) d;
        return i;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double d = scanner.nextDouble();
        System.out.println(extractInt(d));

    }
}