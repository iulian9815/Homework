import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string= scanner.nextLine();
        String[] stringarray = string.split(" ");
       String result = stringarray[0];
        for (int i = 1; i < stringarray.length; i++) {
            String word = stringarray[i];
            if (result.length()<word.length()){
                result=word;

            }

        }
        System.out.println(result);

    }
}