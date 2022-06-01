import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String textUP = text.toUpperCase(Locale.ROOT);
        String textLOW = text.toLowerCase(Locale.ROOT);
        boolean Startwith = textUP.startsWith("J");
        boolean Startwith1 = textLOW.startsWith("j");
        if (Startwith || Startwith1)
            System.out.println("True");
        else
            System.out.println("False");
    }
}