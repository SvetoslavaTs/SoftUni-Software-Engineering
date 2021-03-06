package ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double biggestVolume = 0;
        String biggestKeg = "";

        for (int i = 0; i < n; i++) {
            String model = scanner.nextLine();
            float radius = Float.parseFloat(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            double volume = Math.PI * Math.pow(radius, 2) * height;

            if (volume > biggestVolume) {
                biggestVolume = volume;
                biggestKeg = model;
            }
        }
        System.out.println(biggestKeg);

    }
}
