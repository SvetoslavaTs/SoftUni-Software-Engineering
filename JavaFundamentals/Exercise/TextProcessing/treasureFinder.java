package ExercisesTextProcessing;

import java.lang.reflect.Array;
import java.util.Scanner;

public class treasureFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] key = scanner.nextLine().split(" ");
        String message = scanner.nextLine();
        StringBuilder encryptedMessage = new StringBuilder();

        while (!message.equals("find")) {
            int currentPositionOfTheKey = 0;
            for (int i = 0; i < message.length(); i++) {
                if (currentPositionOfTheKey == key.length) {
                    currentPositionOfTheKey = 0;
                }
                int currentSymbol = message.charAt(i) - Integer.parseInt(key[currentPositionOfTheKey]);
                encryptedMessage.append((char) currentSymbol);
                currentPositionOfTheKey++;
            }
            String typeOfTreasure = encryptedMessage.substring(encryptedMessage.indexOf("&") + 1, encryptedMessage.lastIndexOf("&"));
            String coordination = encryptedMessage.substring(encryptedMessage.indexOf("<") + 1, encryptedMessage.indexOf(">"));
            System.out.printf("Found %s at %s%n", typeOfTreasure, coordination);
            encryptedMessage.setLength(0);
            message = scanner.nextLine();

        }
    }
}
