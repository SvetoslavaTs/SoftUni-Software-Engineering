package ExerciseDataTypesAndVariables;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = Integer.parseInt(scanner.nextLine());
        int opening = 0;
        String pre = "";

        for (int i = 1; i <= lines; i++) {
            String currLine = scanner.nextLine();
            if (currLine.length() == 1) {
                if (opening == 0) {
                    if (currLine.equals("(")) {
                        opening = 1;
                        pre = "UN";
                    } else if (currLine.equals(")")) {
                        pre = "UN";
                        break;
                    }
                } else if (opening == 1) {
                    if (currLine.equals("(")) {
                        pre = "UN";
                        break;
                    } else if (currLine.equals(")")) {
                        opening = 0;
                        pre = "";
                    }
                }
            }
        }
        System.out.printf("%sBALANCED", pre);
    }
}



