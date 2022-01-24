package ExercisesTextProcessing;

import javax.swing.*;
import java.util.Scanner;

public class validUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        boolean isLetterOrDigitOrHyphensOrUnderscores = false;
        for (String userName : input) {
            if (userName.length() >= 3 && userName.length() <= 16) {
                for (int j = 0; j < userName.length(); j++) {
                    if (Character.isLetter(userName.charAt(j)) ||
                            Character.isDigit(userName.charAt(j)) ||
                            (userName.charAt(j) == '-') || (userName.charAt(j) == '_')) {
                        isLetterOrDigitOrHyphensOrUnderscores = true;
                    } else {
                        isLetterOrDigitOrHyphensOrUnderscores = false;
                        break;
                    }
                }
                if (isLetterOrDigitOrHyphensOrUnderscores) {
                    System.out.println(userName);
                }
            }
        }

    }
}
