package FinalExam;

import java.util.Arrays;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String email = scanner.nextLine();
        String commands = scanner.nextLine();
        String manipulated = "";

        while (!commands.equals("Complete")) {
            String[] command = commands.split(" ");
            switch (command[0]) {
                case "Make":
                    if (command[1].equals("Upper")) {
                        email = email.toUpperCase();
                        System.out.println(email);

                    } else if (command[1].equals("Lower")) {
                        email = email.toLowerCase();
                        System.out.println(email);
                    }
                    break;
                case "GetDomain":
                    int count = Integer.parseInt(command[1]);
                    manipulated = email.substring((email.length()) - count);
                    System.out.println(manipulated);
                    break;
                case "GetUsername":
                    if (email.contains("@")) {
                        int indexOfSymbol = email.indexOf('@');
                        manipulated = email.substring(0, indexOfSymbol);
                        System.out.println(manipulated);
                    } else {
                        System.out.println("The email " + email + " doesn't contain the @ symbol.");
                    }
                    break;
                case "Replace":
                    String c = command[1];
                    manipulated = email;
                    int indexOfC = manipulated.indexOf(c.toUpperCase());
                    int indexOfc = manipulated.indexOf(c);
                    while (indexOfC != -1) {
                        manipulated = manipulated.replace(c.toUpperCase(), "-");
                        indexOfC = manipulated.indexOf(c.toUpperCase());
                    }
                    while (indexOfc != -1) {
                        manipulated = manipulated.replace(c, "-");
                        indexOfc = manipulated.indexOf(c);
                    }
                    System.out.println(manipulated);
                    break;
                case "Encrypt":
                    char[] charArray = email.toCharArray();
                    for (char c1 : charArray) {
                        System.out.print((int) c1 + " ");
                    }
                    break;

            }
            commands = scanner.nextLine();
        }


    }
}
