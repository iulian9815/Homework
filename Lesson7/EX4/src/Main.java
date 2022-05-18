import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] stringarray = text.split("-");
        int i;
        for ( i = 0; i < stringarray.length; i++) {
            //System.out.println(stringarray[i]);
            }
        System.out.print(stringarray[1]+'/');
        System.out.print(stringarray[2]+'/');
        System.out.print(stringarray[0]);

    }
}