import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text1= scanner.nextLine();
        String text2 = scanner.nextLine();
        String text11 = text1.replace(" ","");
        String text22 = text2.replace(" ","");
        System.out.println(text11.equals(text22));
    }
}