package ExamPrep;

import java.util.Scanner;

public class Bee {
    public static int startRow = 0;
    public static int startCol = 0;
    public static int pollinatedFlowers = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        char[][] matrix = readMatrix(n, scanner);

        boolean isInTheTerritory = true;
        String command = scanner.nextLine();
        while (!command.equals("End")) {
            if (command.equals("up")) {
                isInTheTerritory = move(startRow - 1, startCol, matrix, command);
            } else if (command.equals("down")) {
                isInTheTerritory = move(startRow + 1, startCol, matrix, command);
            } else if (command.equals("left")) {
                isInTheTerritory = move(startRow, startCol - 1, matrix, command);
            } else if (command.equals("right")) {
                isInTheTerritory = move(startRow, startCol + 1, matrix, command);
            }
            if (!isInTheTerritory) {
                break;
            }
            command = scanner.nextLine();
        }
        StringBuilder output = new StringBuilder();
        if (!isInTheTerritory) {
            output.append("The bee got lost!").append(System.lineSeparator());
        }
        if (pollinatedFlowers >= 5) {
            output.append(String.format("Great job, the bee manage to pollinate %d flowers!", pollinatedFlowers));
        } else {
            output.append(String.format("The bee couldn't pollinate the flowers, she needed %d flowers more", 5 - pollinatedFlowers));
        }
        System.out.println(output);
        System.out.println(printMatrix(matrix));
    }


    private static boolean move(int newRow, int newCol, char[][] matrix, String command) {
        matrix[startRow][startCol] = '.';
        startRow = newRow;
        startCol = newCol;

        if (isOutOfTheTerritory(newRow, newCol, matrix)) {
            return false;
        }

        char symbol = matrix[newRow][newCol];
        matrix[newRow][newCol] = 'B';
        if (symbol == 'f') {
            pollinatedFlowers++;
        } else if (symbol == 'O') {
            if (command.equals("up")) {
                move(newRow - 1, newCol, matrix, command);
            } else if (command.equals("down")) {
                move(newRow + 1, newCol, matrix, command);
            } else if (command.equals("left")) {
                move(newRow, newCol - 1, matrix, command);
            } else if (command.equals("right")) {
                move(newRow, newCol + 1, matrix, command);
            }

        }
        return true;
    }

    private static boolean isOutOfTheTerritory(int row, int col, char[][] matrix) {
        return row < 0 || row >= matrix.length || col < 0 || col >= matrix[row].length;
    }

    private static char[][] readMatrix(int n, Scanner scanner) {
        char[][] matrix = new char[n][n];
        for (int row = 0; row < n; row++) {
            String line = scanner.nextLine();
            matrix[row] = line.toCharArray();
            if (line.contains("B")) {
                startRow = row;
                startCol = line.indexOf("B");
            }
        }
        return matrix;
    }

    private static String printMatrix(char[][] matrix) {
        StringBuilder sb = new StringBuilder();
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                sb.append(matrix[r][c]);
            }
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }
}
