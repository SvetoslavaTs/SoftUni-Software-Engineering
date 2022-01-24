import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int min = Integer.MAX_VALUE;
        int counter = 1;

        while (counter <= n) {
            int number = Integer.parseInt(scanner.nextLine());
            counter++;
            if (number < min) {
                min = number;
            }
        }
        System.out.println(min);
    }
}
