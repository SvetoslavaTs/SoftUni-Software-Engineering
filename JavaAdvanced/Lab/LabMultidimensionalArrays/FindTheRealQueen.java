package LabMultidimensionalArrays;

import java.util.Scanner;

public class FindTheRealQueen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] matrix = readMatrix(scanner);

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col].equals("q") && isValid(row, col, matrix)) {
                    System.out.print(row + " " + col);

                }
            }
        }

    }

    private static boolean isValid(int row, int col, String[][] matrix) {
        for (int rowDirection = -1; rowDirection <= 1; rowDirection++) {
            for (int colDirection = -1; colDirection <= 1; colDirection++) {

                if (rowDirection == 0 && colDirection == 0) {
                    continue;
                }
                int currentRow = row + rowDirection;
                int currentCol = col + colDirection;

                boolean validPosition = isValidPosition(matrix, currentRow, currentCol);

                while (validPosition) {
                    if (matrix[currentRow][currentCol].equals("q")) {
                        return false;
                    }
                    currentRow = currentRow + rowDirection;
                    currentCol = currentCol + colDirection;

                    validPosition = isValidPosition(matrix, currentRow, currentCol);
                }
            }
        }
        return true;
    }

    private static boolean isValidPosition(String[][] matrix, int currentRow, int currentCol) {
        return currentRow >= 0
                && currentRow < matrix.length
                && currentCol >= 0
                && currentCol < matrix[currentRow].length;
    }


    private static String[][] readMatrix(Scanner scanner) {
        String[][] matrix = new String[8][8];
        for (int row = 0; row < matrix.length; row++) {
            String[] line = scanner.nextLine().split("\\s+");
            matrix[row] = line;
        }
        return matrix;
    }
}
