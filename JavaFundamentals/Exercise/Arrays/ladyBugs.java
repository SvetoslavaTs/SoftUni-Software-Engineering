package ExerciseArrays;

import java.util.Scanner;

public class ladyBugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeField = Integer.parseInt(scanner.nextLine());
        int[] field = new int[sizeField];
        String[] ladyBugsIndexes = scanner.nextLine().split(" ");

        for (int i = 0; i < ladyBugsIndexes.length; i++) {
            int bugIndex = Integer.parseInt(ladyBugsIndexes[i]);
            if (bugIndex >= 0 && bugIndex < field.length) {
                field[bugIndex] = 1;
            }
        }
        String commands = scanner.nextLine();
        while (!commands.equals("end")) {
            String[] command = commands.split(" ");
            int bugIndex = Integer.parseInt(command[0]);
            String direction = command[1];
            int length = Integer.parseInt(command[2]);

            if (bugIndex < 0 || bugIndex >= field.length || field[bugIndex] != 1) {
                commands = scanner.nextLine();
                continue;
            }
            field[bugIndex] = 0;

            if (direction.equals("right")) {
                bugIndex += length;

                while (bugIndex < field.length && field[bugIndex] == 1) {
                    bugIndex += length;
                }
                if (bugIndex < field.length) {
                    field[bugIndex] = 1;
                }
            } else {
                bugIndex -= length;

                while (bugIndex >= 0 && field[bugIndex] == 1) {
                    bugIndex -= length;
                }
                if (bugIndex >= 0) {
                    field[bugIndex] = 1;
                }
            }

            commands = scanner.nextLine();
        }
        for (int i = 0; i < field.length; i++) {
            System.out.print(field[i] + " ");
        }
    }
}
