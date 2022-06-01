import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double a = scanner.nextLong();
        int n = scanner.nextInt();

        System.out.println(nPower(a,n));
    }

    private static long nPower(double a,int n) {
        Scanner scanner = new Scanner(System.in);
if (n==0)
    return 1;
        long result;
        if (n % 2 == 0) {
            return nPower (a * a , n / 2);
        } else
            return nPower(a * a , n - 1);


    }
}