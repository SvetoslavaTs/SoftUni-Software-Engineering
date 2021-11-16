package ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int p = scanner.nextInt();

        int courses = (int) Math.ceil(((double) n / p));
        System.out.println(courses);

    }
}
