package LabMultidimensionalArrays;

public class SnakeMatrix {
    public static void main(String[] args) {
        int[][] arr = new int[8][32];

        int count = 0;

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (row % 2 == 1) {
                    arr[row][arr[row].length - 1 - col] = count++;
                } else {
                    arr[row][col] = count++;
                }
            }
        }
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + ", ");
            }
            System.out.println();
        }
    }
}
