import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int len = scaner.nextInt();
        int[] array =new int[len];


        for (int i = 0; i < len; i++) {
            array[i] = scaner.nextInt();
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
