package ExercisesMultidimensionalArrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringMatrixRotationReadCharMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int degrees = Integer.parseInt(scanner.nextLine().split("[\\(\\)]")[1]);
        int rotations = degrees / 90 % 4;
        if (rotations == 0) {
            String matrixLine = "";
            while (!(matrixLine = scanner.nextLine()).equals("END")) {
                System.out.println(matrixLine);
            }
            return;
        }
        String line = scanner.nextLine();
        int maxLength = 0;
        List<String> matrixInput = new ArrayList<>();
        while (!(line.equals("END"))) {
            matrixInput.add(line);
            if (maxLength < line.length()) {
                maxLength = line.length();
            }
            line = scanner.nextLine();
        }
        char[][] matrix = readMatrix(matrixInput, maxLength);


        if (rotations == 1) {
            int cols = 0;
            while (cols < maxLength) {
                int rows = matrix.length - 1;
                while (rows >= 0) {
                    System.out.print(matrix[rows--][cols]);
                }
                cols++;
                System.out.println();
            }

        } else if (rotations == 2) {
            for (int rows = matrix.length - 1; rows >= 0; rows--) {
                for (int cols = matrix[rows].length - 1; cols >= 0; cols--) {
                    System.out.print(matrix[rows][cols]);
                }
                System.out.println();
            }

        } else if (rotations == 3) {
            int cols = maxLength - 1;
            while (cols >= 0) {
                int rows = 0;
                while (rows < matrix.length) {
                    System.out.print(matrix[rows++][cols]);
                }
                cols--;
                System.out.println();
            }
        }

    }


    private static char[][] readMatrix(List<String> matrixInput, int maxLength) {
        char[][] matrix = new char[matrixInput.size()][maxLength];
        for (int rows = 0; rows < matrix.length; rows++) {
            for (int cols = 0; cols < maxLength; cols++) {
                if (cols >= matrixInput.get(rows).length()) {
                    matrix[rows][cols] = ' ';
                } else {
                    matrix[rows][cols] = matrixInput.get(rows).charAt(cols);
                }
            }
        }
        return matrix;
    }
}
