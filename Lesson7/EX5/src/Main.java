import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string= scanner.nextLine();
        String substring= scanner.nextLine();
        String stringwithoutspaces = string.replace(" ","");
        int counter=0;



            boolean contain;
            if ( contain = Boolean.parseBoolean(String.valueOf(stringwithoutspaces.contains(substring)))) {
                counter++;

                stringwithoutspaces = stringwithoutspaces.replace(substring, "");
            }



        System.out.println(counter);
    }
}
