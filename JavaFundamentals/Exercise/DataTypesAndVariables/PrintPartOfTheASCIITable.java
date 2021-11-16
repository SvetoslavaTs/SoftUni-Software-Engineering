package ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class PrintPartOfTheASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int symbol = Integer.parseInt(scanner.nextLine());
        int symbolEnd = Integer.parseInt(scanner.nextLine());

        for (int i = symbol; i <= symbolEnd; i++) {

            System.out.print((char) i + " ");
        }
    }
}
