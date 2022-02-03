package LabMultidimensionalArrays;

import java.util.Scanner;

public class InitializationReadingFromConsoleOfMultidimensionalArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        int[][] array = new int[3][4];
//        for (int row = 0; row < array.length; row++)
//            for (int col = 0; col < array[0].length; col++)
//                array[row][col] = row + col;

//        int[][] array = new int[3][4];
//        for (int row = 0; row < array.length; row++)
//            for (int col = 0; col < array[row].length; col++)
//                array[row][col] = row + col;

//        int[][] matrix = {
//                {1, 2, 3, 4}, // row 0 values
//                {5, 6, 7, 8}  // row 1 values
//        };
        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            String[] inputTokens = scanner.nextLine().split(" ");
            for (int column = 0; column < cols; column++) {
                matrix[row][column] =
                        Integer.parseInt(inputTokens[column]);
            }
        }
    }


}


