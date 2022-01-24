import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 1; i <= n; i++) {
            int value = Integer.parseInt(scanner.nextLine());
            if (value > max) {
                max = value;
            }
            if (value < min) {
                min = value;
            }

        }
        System.out.printf("Max number: %d%nMin number: %d", max, min);
    }

}

