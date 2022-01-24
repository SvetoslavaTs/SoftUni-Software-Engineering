import java.util.Scanner;

public class GameOfIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = Integer.parseInt(scanner.nextLine());
        double totalCounter = 0;
        double counterTo9 = 0;
        double counterTo19 = 0;
        double counterTo29 = 0;
        double counterTo39 = 0;
        double counterTo50 = 0;
        double counterInvalid = 0;

        for (int i = 1; i <= numbers; i++) {
            int move = Integer.parseInt(scanner.nextLine());
            if (move >= 0 && move <= 9) {
                totalCounter += move * 0.2;
                counterTo9 += 1;
            } else if (move >= 10 && move <= 19) {
                totalCounter += move * 0.3;
                counterTo19 += 1;
            } else if (move >= 20 && move <= 29) {
                totalCounter += move * 0.4;
                counterTo29 += 1;
            } else if (move >= 30 && move <= 39) {
                totalCounter += 50;
                counterTo39 += 1;
            } else if (move >= 40 && move <= 50) {
                totalCounter += 100;
                counterTo50 += 1;
            } else {
                totalCounter /= 2;
                counterInvalid += 1;
            }
        }
        System.out.printf("%.2f%n", totalCounter);
        System.out.printf("From 0 to 9: %.2f%%%n", counterTo9 / numbers * 100);
        System.out.printf("From 10 to 19: %.2f%%%n", counterTo19 / numbers * 100);
        System.out.printf("From 20 to 29: %.2f%%%n", counterTo29 / numbers * 100);
        System.out.printf("From 30 to 39: %.2f%%%n", counterTo39 / numbers * 100);
        System.out.printf("From 40 to 50: %.2f%%%n", counterTo50 / numbers * 100);
        System.out.printf("Invalid numbers: %.2f%%", counterInvalid / numbers * 100);
    }
}
