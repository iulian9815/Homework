import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        String text1 = String.valueOf(text.endsWith("burg"));
        System.out.println(text1);
    }
}