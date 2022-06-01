import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] stringarray = text.split("");
        int counter=1;
        for (int i = 1; i < stringarray.length; i++) {
            //System.out.println(stringarray[i]);
            if (stringarray[i].equals(stringarray[i-1])){
                counter++;
                if (stringarray[i]==stringarray[stringarray.length-1])
                    System.out.println(stringarray[i-1]+ counter);
            }
            else {
                System.out.println(stringarray[i-1]+ counter);
                counter=1;
            }
        }
    }
}