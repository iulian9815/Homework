import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            char[][] array = new char[5][5];
           // char[] C = scanner.next().toCharArray();


            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                  if (i==0 || i== 4)
                      array[i][j] = '-';
                }
            }
            array[1][0]= '|';
            array[2][0]= '|';
            array[3][0]= '|';
            array[1][4]= '|';
            array[2][4]= '|';
            array[3][4]= '|';

            array[1][1]= scanner.next().charAt(0);
            array[1][2]= scanner.next().charAt(0);
            array[1][3]= scanner.next().charAt(0);
            array[2][1]= scanner.next().charAt(0);
            array[2][2]= scanner.next().charAt(0);
            array[2][3]= scanner.next().charAt(0);
            array[3][1]= scanner.next().charAt(0);
            array[3][2]= scanner.next().charAt(0);
            array[3][3]= scanner.next().charAt(0);

            for (char[] chars : array) {
                for (char a : chars) {
                    System.out.print(a + " ");
                }
                System.out.println();
            }

        }
        }

