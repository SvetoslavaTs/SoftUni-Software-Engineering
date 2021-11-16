package ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class DataTypeFinderTryCatchApproach {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String type = "string";

        while (!input.equals("END")) {
            boolean isInteger = false;
            boolean isDouble = false;

            try {
                int integer = Integer.parseInt(input);
                isInteger = true;

            } catch (Exception ignored) {
            }

            try {
                double doubletype = Float.parseFloat(input);
                isDouble = true;
            } catch (Exception ignored) {
            }
            if (isInteger && isDouble) {
                if (input.contains(".")) {
                    isInteger = false;
                    type = "floating point";
                } else {
                    isDouble = false;
                    type = "integer";
                }
            }
            if (input.length() == 1 && !isInteger) {
                type = "character";
            } else if (input.toLowerCase().equals("false") || input.toLowerCase().equals("true")) {
                type = "boolean";
            } else if (isDouble) {
                type = "floating point";
            }
            System.out.printf("%s is %s type%n", input, type);
            input = scanner.nextLine();
            type = "string";

        }

    }
}

