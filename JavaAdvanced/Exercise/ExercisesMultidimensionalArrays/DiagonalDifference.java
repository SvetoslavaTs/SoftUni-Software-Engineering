package ExercisesMultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[][] matrix = readMatrix(scanner, n);
        int sumOfPrimaryDiagonal = findSumOfPrimaryDiagonal(matrix, n);
        int sumOfSecondaryDiagonal = findSumOfSecondaryDiagonal(matrix, n);
        System.out.println(Math.abs(sumOfPrimaryDiagonal - sumOfSecondaryDiagonal));
    }

    private static int findSumOfSecondaryDiagonal(int[][] matrix, int n) {
        int sum = 0;
        int rows = n - 1;
        for (int cols = 0; cols < n; cols++) {
            sum += matrix[rows--][cols];
        }

        return sum;
    }

    private static int findSumOfPrimaryDiagonal(int[][] matrix, int n) {
        int sum = 0;
        for (int rows = 0; rows < matrix.length; rows++) {
            sum += matrix[rows][rows];
        }
        return sum;
    }

    private static int[][] readMatrix(Scanner scanner, int n) {

        int[][] matrix = new int[n][n];
        for (int row = 0; row < matrix.length; row++) {
            int[] line = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            matrix[row] = line;
        }
        return matrix;
    }
}
