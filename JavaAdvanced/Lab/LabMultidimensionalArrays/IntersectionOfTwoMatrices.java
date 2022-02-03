package LabMultidimensionalArrays;

import java.util.Scanner;

public class IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        char[][] firstMatrix = readCharMatrix(scanner, rows, cols);
        char[][] secondMatrix = readCharMatrix(scanner, rows, cols);
        char[][] intersectionMatrix = new char[rows][cols];

        for (int row = 0; row < firstMatrix.length; row++) {
            for (int col = 0; col < firstMatrix[row].length; col++) {
                if (firstMatrix[row][col] != secondMatrix[row][col]) {
                    intersectionMatrix[row][col] = '*';
                } else {
                    intersectionMatrix[row][col] = firstMatrix[row][col];
                }
            }
        }
        printMatrix(intersectionMatrix);

    }

    private static void printMatrix(char[][] intersectionMatrix) {
        for (int row = 0; row < intersectionMatrix.length; row++) {
            for (int col = 0; col < intersectionMatrix[row].length; col++) {
                System.out.print(intersectionMatrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static char[][] readCharMatrix(Scanner scanner, int rows, int cols) {

        char[][] matrix = new char[rows][cols];
        for (int row = 0; row < matrix.length; row++) {
            char[] input = scanner.nextLine().replaceAll("\\s+", "").toCharArray();
            matrix[row] = input;
        }
        return matrix;
    }
}
