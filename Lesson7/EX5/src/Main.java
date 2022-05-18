import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string= scanner.nextLine();
        String substring= scanner.nextLine();
        String stringwithoutspaces = string.replace(" ","");
        int counter=0;

        boolean contains = stringwithoutspaces.contains(substring);
        if (contains==true)
            counter++;

        System.out.println(counter);
    }
}