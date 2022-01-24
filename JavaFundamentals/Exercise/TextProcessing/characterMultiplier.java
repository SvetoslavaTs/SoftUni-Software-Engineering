package ExercisesTextProcessing;

import java.util.Scanner;

public class characterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        String str1 = input[0];
        String str2 = input[1];

        long total = multiply(str1, str2);
        System.out.println(total);
    }

    private static long multiply(String str1, String str2) {
        long sum = 0;
        for (int i = 0; i < Math.min(str1.length(), str2.length()); i++) {
            sum += str1.charAt(i) * str2.charAt(i);
        }
        if (str1.length() > str2.length()) {
            for (int i = str2.length(); i < str1.length(); i++) {
                sum += str1.charAt(i);
            }
        } else {
            for (int i = str1.length(); i < str2.length(); i++) {
                sum += str2.charAt(i);
            }

        }
        return sum;
    }
}
