import java.util.Scanner;

public class DivideWithoutRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int group2 = 0;
        int group3 = 0;
        int group4 = 0;

        for (int i = 1; i <= n; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            if (currentNum % 2 == 0) {
                group2++;
            }
            if (currentNum % 3 == 0) {
                group3++;
            }
            if (currentNum % 4 == 0) {
                group4++;
            }
        }
        System.out.printf("%.2f%%%n", 1.0 * group2 / n * 100);
        System.out.printf("%.2f%%%n", 1.0 * group3 / n * 100);
        System.out.printf("%.2f%%%n", 1.0 * group4 / n * 100);
    }
}

