package ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = "";
        String password = "";
        int countOfTrays = 0;

        String username = scanner.nextLine();
        int usernameLength = username.length();
        for (int j = usernameLength - 1; j >= 0; j--) {
            password += username.charAt(j);
        }
        while (countOfTrays <= 3) {
            String enteredPassword = scanner.nextLine();

            if (password.equals(enteredPassword)) {
                message = String.format("User %s logged in.", username);
                System.out.println(message);
                break;
            } else {
                message = "Incorrect password. Try again.";
                System.out.println(message);
                countOfTrays++;
                continue;
            }
        }

        if (countOfTrays >= 4) {
            message = String.format("User %s blocked!", username);
            System.out.println(message);
        }


    }
}


