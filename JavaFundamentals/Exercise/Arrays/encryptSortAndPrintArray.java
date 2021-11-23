package ExerciseArrays;

import java.util.Arrays;
import java.util.Scanner;

public class encryptSortAndPrintArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int [] encryptedNames = new int[n];

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            int stringLength = name.length();
            int sum = 0;
            for (int j = 0; j < stringLength; j++) {
                boolean isVowelOrNot = checkIfVowelOrNot(name.charAt(j));
                if(isVowelOrNot) {
                    sum += name.charAt(j) * stringLength;
                } else {
                    sum += name.charAt(j) / stringLength;
                }
            }
            encryptedNames[i] = sum;

        }
        Arrays.stream(encryptedNames).sorted().forEach(System.out::println);
    }

    private static boolean checkIfVowelOrNot(char character) {
        int[] vowels = {65, 97, 69, 101, 73, 105, 79, 111, 85, 117, 89, 121};
        boolean isVowel = false;
        for (int vowel : vowels) {
            if (character == vowel) {
                isVowel = true;
                break;
                          }
        }
        return isVowel;
    }

}
