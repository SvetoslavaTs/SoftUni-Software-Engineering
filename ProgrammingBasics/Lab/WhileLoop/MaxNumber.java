import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int numberCounter = 1;
        int max = Integer.MIN_VALUE;

        while (numberCounter <= n) {
            int number = Integer.parseInt(scanner.nextLine());
            numberCounter++;
            if (number > max) {
                max = number;
            }
        }
        System.out.println(max);
    }
}
