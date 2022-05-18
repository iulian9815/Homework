import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        String text1 = text.replace('a' , 'b');
        System.out.println(text1);
    }
}