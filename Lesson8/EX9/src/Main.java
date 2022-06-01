import java.util.Scanner;
public class Main {
    /* Fix this method */
    public static void printReverseCharByChar(String s) {
        if (s.length() > 0) {

            for (int i = s.length()-1; i >= 0; i--) {
                System.out.print(s.charAt(i));

            }
        }
    }
    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        printReverseCharByChar(scanner.nextLine());
    }
}