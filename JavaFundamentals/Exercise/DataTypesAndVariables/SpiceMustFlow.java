package ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startingYield = Integer.parseInt(scanner.nextLine());
        int daysCount = 0;
        int totalVolume = 0;

        while (startingYield >= 100) {
            totalVolume += startingYield - 26;
            startingYield -= 10;
            daysCount++;
        }
        if (totalVolume > 26) {
            totalVolume -= 26;
        }
        System.out.println(daysCount);
        System.out.println(totalVolume);
    }
}
