package midExamPrep;

import java.lang.reflect.Array;
import java.util.Scanner;

public class bonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfTheStudents = scanner.nextInt();
        int countOfTheLectures = scanner.nextInt();
        int additionalBonus = scanner.nextInt();
        double totalBonus = 0;
        int totalAttendances = 0;

        for (int i = 0; i < countOfTheStudents; i++) {
            int studentAttendances = scanner.nextInt();
            double currentBonus = (studentAttendances / (double) countOfTheLectures) * (5 + additionalBonus);
            if (currentBonus > totalBonus) {
                totalBonus = currentBonus;
                totalAttendances = studentAttendances;
            }
        }
        System.out.printf("Max Bonus: %.0f.%nThe student has attended %d lectures.", totalBonus, totalAttendances);
    }

}
