import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void sort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++)
        {
            for (int j = i + 1; j < numbers.length; j++)
            {
                int tmp = 0;
                if (numbers[i] > numbers[j])
                {
                    tmp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = tmp;
                }
            }
        }
    }
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        String[] values = scanner.nextLine().split("\\s+");
        int[] numbers = Arrays.stream(values)
                .mapToInt(Integer::parseInt)
                .toArray();
        sort(numbers);
        Arrays.stream(numbers).forEach(e -> System.out.print(e + " "));
    }
}