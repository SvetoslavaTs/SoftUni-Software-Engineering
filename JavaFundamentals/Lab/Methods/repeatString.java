package LabMethods;

import java.util.Scanner;

public class repeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String symbols = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println(repeatStringNTimes(symbols, n));

    }

    static String repeatStringNTimes(String symbols, int n) {
        String[] symbolsAsArray = new String[n];
        for (int i = 0; i < n; i++) {
            symbolsAsArray[i] = symbols;
        }
        return String.join("", symbolsAsArray);
    }
}
