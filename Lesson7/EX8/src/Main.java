import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder text = new StringBuilder(scanner.nextLine());
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i)=='0') {
                text.deleteCharAt(i);
            }else if ((text.charAt(i)=='1')) {
                text.deleteCharAt(i);
            } else if ((text.charAt(i)=='2')) {
                text.deleteCharAt(i);
            } else if ((text.charAt(i)=='3')) {
                text.deleteCharAt(i);
            }else if ((text.charAt(i)=='4')) {
                text.deleteCharAt(i);
            } else if ((text.charAt(i)=='5')) {
                text.deleteCharAt(i);
            } else if ((text.charAt(i)=='6')) {
                text.deleteCharAt(i);
            }else if ((text.charAt(i)=='7')) {
                text.deleteCharAt(i);
            } else if ((text.charAt(i)=='8')) {
                text.deleteCharAt(i);
            } else if ((text.charAt(i)=='9')) {
                text.deleteCharAt(i);
            }else
                text.charAt(i);
        }
        System.out.println(text);
    }
}