package ExercisesTextProcessing;

import java.util.Scanner;

public class asciiSumator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char firstSymbol = scanner.nextLine().charAt(0);
        char secondSymbol = scanner.nextLine().charAt(0);
        String randomString = scanner.nextLine();
        int sum = 0;

        for (int j = 0; j < randomString.length(); j++) {
            char currentSymbolFromRandomString = randomString.charAt(j);
            for (int i = Math.min(firstSymbol, secondSymbol) + 1;
                 i < Math.max(firstSymbol, secondSymbol); i++) {
                char currentSymbolFromASCIITable = (char) i;
                if (currentSymbolFromRandomString == currentSymbolFromASCIITable) {
                    sum += currentSymbolFromRandomString;
                    break;
                }
            }
        }
        System.out.println(sum);

    }
}
