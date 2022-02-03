package LabMultidimensionalArrays;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = readMatrix(scanner);
        ArrayDeque<Integer> diagonals = new ArrayDeque<>();

        for (int row = 0; row < matrix.length; row++) {
            diagonals.offer(matrix[row][row]);
        }
        int col = 0;
        for (int row = matrix.length - 1; row >= 0; row--) {
            diagonals.offer(matrix[row][col]);
            col++;
        }
        while (!diagonals.isEmpty()) {
            for (int i = 0; i < matrix.length; i++) {
                System.out.print(diagonals.poll() + " ");
            }
            System.out.println();
        }
    }


    private static int[][] readMatrix(Scanner scanner) {
        int input = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[input][input];
        for (int row = 0; row < matrix.length; row++) {
            int[] line = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            matrix[row] = line;
        }
        return matrix;
    }
}
