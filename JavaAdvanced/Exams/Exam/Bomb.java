package Exam;

import java.util.Arrays;
import java.util.Scanner;

public class Bomb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] commands = scanner.nextLine().split(",");

        char[][] matrix = readMatrix(scanner, n);

        int allBomb = 0;
        char startPosition = 's';
        int startRow = 0;
        int startCol = 0;
        for (int rows = 0; rows < matrix.length; rows++) {
            for (int cols = 0; cols < matrix[rows].length; cols++) {
                if (matrix[rows][cols] == startPosition) {
                    startRow = rows;
                    startCol = cols;
                } else if (matrix[rows][cols] == 'B') {
                    allBomb++;
                }
            }
        }

        int currentRow = startRow;
        int currentCOl = startCol;
        for (int i = 0; i < commands.length; i++) {
            String command = commands[i];

            switch (command) {
                case "up":
                    currentRow = currentRow - 1;
                    if (currentRow >= 0 && currentRow < matrix.length &&
                            currentCOl >= 0 && currentCOl < matrix[currentRow].length) {
                        boolean isBomb = checkContent(currentCOl, currentRow, matrix, allBomb);
                        if (isBomb) {
                            allBomb--;
                        }
                    } else {
                        currentRow = currentRow + 1;
                    }
                    break;
                case "down":
                    currentRow = currentRow + 1;
                    if (currentRow >= 0 && currentRow < matrix.length &&
                            currentCOl >= 0 && currentCOl < matrix[currentRow].length) {
                        boolean isBomb = checkContent(currentCOl, currentRow, matrix, allBomb);
                        if (isBomb) {
                            allBomb--;
                        }
                    } else {
                        currentRow = currentRow - 1;
                    }
                    break;
                case "left":
                    currentCOl = currentCOl - 1;
                    if (currentRow >= 0 && currentRow < matrix.length &&
                            currentCOl >= 0 && currentCOl < matrix[currentRow].length) {
                        boolean isBomb = checkContent(currentCOl, currentRow, matrix, allBomb);
                        if (isBomb) {
                            allBomb--;
                        }
                    } else {
                        currentCOl = currentCOl + 1;
                    }
                    break;
                case "right":
                    currentCOl = currentCOl + 1;
                    if (currentRow >= 0 && currentRow < matrix.length &&
                            currentCOl >= 0 && currentCOl < matrix[currentRow].length) {
                        boolean isBomb = checkContent(currentCOl, currentRow, matrix, allBomb);
                        if (isBomb) {
                            allBomb--;
                        }
                    } else {
                        currentCOl = currentCOl - 1;
                    }
                    break;
            }

        }

        if (allBomb == 0) {
            System.out.println("Congratulations! You found all bombs!");
        }
    }

    private static boolean checkContent(int currentCOl, int currentRow, char[][] matrix, int allBomb) {
        boolean isBomb = false;
        char currentChar = matrix[currentRow][currentCOl];
        if (currentChar == 'B') {
            isBomb = true;
            System.out.println("You found a bomb!");
        } else if (currentChar == 'e') {
            if (allBomb == 0) {
                System.out.println("Congratulations! You found all bombs!");
            } else {
                System.out.printf("END! %d bombs left on the field%n", allBomb);
            }
        }
        return isBomb;
    }


    private static char[][] readMatrix(Scanner scanner, int n) {

        char[][] matrix = new char[n][n];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = scanner.next().charAt(0);
            }

        }
        return matrix;
    }
}
