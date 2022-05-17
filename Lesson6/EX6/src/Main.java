import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        char[][] array = new char[4][4];
        char[] C = scaner.next().toCharArray();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                
            }
        }
        int maxcounter = 1;
        int counter = 1;
        for (int i = 1; i < len; i++) {
            int curent = array[i];
            int precedent = array[i-1];
            if (curent>precedent) {
                counter++;
                if (counter>maxcounter)
                    maxcounter++;
            }
            else
                counter=1;


        }
        System.out.println(maxcounter);
    }
}

        S