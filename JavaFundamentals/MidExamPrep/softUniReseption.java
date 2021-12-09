package midExamPrep;

import java.util.Scanner;

public class softUniReseption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentPerHourForFirstEmployee = scanner.nextInt();
        int studentPerHourForSecondEmployee = scanner.nextInt();
        int studentPerHourForThirdEmployee = scanner.nextInt();
        int input2 = scanner.nextInt();
        int studentAnswered = 0;
        int hoursNeeded = 0;
        int counterEveryFourthHour = 0;

        while (studentAnswered < input2) {
            hoursNeeded++;
            counterEveryFourthHour++;
            if (counterEveryFourthHour == 4) {
                counterEveryFourthHour = 0;
                continue;
            }
            studentAnswered += studentPerHourForFirstEmployee
                    + studentPerHourForSecondEmployee + studentPerHourForThirdEmployee;
        }
        System.out.printf("Time needed: %dh.", hoursNeeded);
    }
}
