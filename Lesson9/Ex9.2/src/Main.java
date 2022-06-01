import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String sc = getString();
        System.out.println(sc);
    }
    public static String getString() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}