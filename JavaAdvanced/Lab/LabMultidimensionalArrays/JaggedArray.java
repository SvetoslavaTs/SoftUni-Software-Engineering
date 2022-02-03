package LabMultidimensionalArrays;

public class JaggedArray {
    public static void main(String[] args) {

        int[][] arr = new int[3][];

        arr[0] = new int[2];
        arr[1] = new int[7];
        arr[2] = new int[10];

        int counter = Integer.MAX_VALUE;

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = counter--;
            }
        }
        System.out.println();
    }
}
