package ExercisesMultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] matrix = readMatrix(scanner);
        String line = scanner.nextLine();


        while (!line.equals("END")) {
            String[] tokens = line.split("\\s+");
            if (!line.startsWith("swap") || tokens.length != 5) {
                System.out.println("Invalid input!");
                line = scanner.nextLine();
                continue;
            }
            String command = tokens[0];
            int[] coordinates = new int[tokens.length - 1];
            for (int i = 0; i < coordinates.length; i++) {
                coordinates[i] = Integer.parseInt(tokens[i + 1]);
            }

            if (command.equals("swap") && coordinates.length == 4 && validCoordinate(coordinates, matrix)) {
                String firstCoordinates = matrix[coordinates[0]][coordinates[1]];
                matrix[coordinates[0]][coordinates[1]] = matrix[coordinates[2]][coordinates[3]];
                matrix[coordinates[2]][coordinates[3]] = firstCoordinates;

                for (String[] ints : matrix) {
                    for (String anInt : ints) {
                        System.out.print(anInt + " ");
                    }
                    System.out.println();
                }

            } else {
                System.out.println("Invalid input!");
            }
            line = scanner.nextLine();
        }
    }

    private static boolean validCoordinate(int[] coordinates, String[][] matrix) {
        boolean isValidCoordinates = true;
        for (int i = 0; i < 4; i++) {
            if (i % 2 == 0) {
                if (!(coordinates[i] >= 0 && coordinates[i] < matrix.length)) {
                    isValidCoordinates = false;
                    break;
                }
            } else {
                if (!(coordinates[i] >= 0 && coordinates[i] < matrix[coordinates[i - 1]].length)) {
                    isValidCoordinates = false;
                    break;
                }
            }
        }
        return isValidCoordinates;
    }

    private static String[][] readMatrix(Scanner scanner) {
        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String[][] matrix = new String[input[0]][input[1]];
        for (int row = 0; row < matrix.length; row++) {
            String[] line = scanner.nextLine().split(" ");
            matrix[row] = line;
        }
        return matrix;
    }
}
