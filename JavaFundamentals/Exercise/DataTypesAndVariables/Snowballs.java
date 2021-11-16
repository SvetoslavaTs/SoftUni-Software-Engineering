package ExerciseDataTypesAndVariables;

import javax.swing.*;
import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double maxValue = Double.MIN_VALUE;
        int snowBallOut = 0;
        int snowTimeOut = 0;
        int snowQualityOut = 0;

        for (int i = 0; i < n; i++) {
            int snowballSnow = scanner.nextInt();
            int snowballTime = scanner.nextInt();
            int snowballQuality = scanner.nextInt();

            double snowballValue = Math.pow((snowballSnow / snowballTime), snowballQuality);
            if (maxValue < snowballValue) {
                maxValue = snowballValue;
                snowBallOut = snowballSnow;
                snowTimeOut = snowballTime;
                snowQualityOut = snowballQuality;
            }

        }
        System.out.printf("%d : %d = %.0f (%d)", snowBallOut, snowTimeOut, maxValue, snowQualityOut);
        ;
    }
}
