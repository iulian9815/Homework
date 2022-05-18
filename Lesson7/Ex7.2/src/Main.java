import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String text1 = text.substring(a , b+1);
        System.out.println(text1);
    }
}