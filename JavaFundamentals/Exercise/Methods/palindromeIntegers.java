package ExerciseMethods;

import java.util.Arrays;
import java.util.Scanner;

public class palindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        while (!command.equals("END")) {
            int[] arr = Arrays.stream(command.split("")).mapToInt(Integer::parseInt).toArray();
            boolean isPalindrome = isPalindrome(arr, reverseArray(arr));
            System.out.println(isPalindrome);
            command = scanner.nextLine();
        }
    }

    private static boolean isPalindrome(int[] arr, int[] reversed) {
        boolean isPalindrome = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != reversed[i]) {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }

    private static int[] reverseArray(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i <= reversed.length - 1; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }
}

