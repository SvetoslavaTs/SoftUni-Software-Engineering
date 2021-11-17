package ExerciseArrays;

import java.util.Scanner;

public class zigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] firstArray = new int[n];
        int[] secondArray = new int[n];
        int zag = 1;
        for (int i = 0; i < n; i++) {
            if (zag % 2 != 0) {
                firstArray[i] = scanner.nextInt();
                secondArray[i] = scanner.nextInt();
            } else {
                secondArray[i] = scanner.nextInt();
                firstArray[i] = scanner.nextInt();
            }
            zag++;
        }
        for (int number : firstArray) {
            System.out.print(number + " ");
        }
        System.out.println();
        for (int number : secondArray) {
            System.out.print(number + " ");
        }
    }
}
