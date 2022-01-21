package midExam;

import java.util.Scanner;

public class Problem1BlackFlag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int dailyPlunder = Integer.parseInt(scanner.nextLine());
        double expectedPlunder = Double.parseDouble(scanner.nextLine());

        double totalPlunder = 0;
        int countEveryThirdDay = 0;
        int countEveryFifthDay = 0;
        for (int i = 0; i < days; i++) {
            totalPlunder += dailyPlunder;
            countEveryThirdDay++;
            countEveryFifthDay++;
            if (countEveryThirdDay == 3) {
                totalPlunder += dailyPlunder * 0.5;
                countEveryThirdDay = 0;
            }
            if (countEveryFifthDay == 5) {
                totalPlunder = totalPlunder - (totalPlunder * 0.3);
                countEveryFifthDay = 0;
            }
        }
        if (totalPlunder >= expectedPlunder) {
            System.out.printf("Ahoy! %.2f plunder gained.", totalPlunder);
        } else {
            System.out.printf("Collected only %.2f%% of the plunder.", (totalPlunder / expectedPlunder) * 100);
        }

    }
}
