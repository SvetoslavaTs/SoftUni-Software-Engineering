package midExamPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class activationKeysNeEReshenaSAMO47procenta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String rawActivationKey = scanner.nextLine();
        List<String> rawActivationKeyAsList = new ArrayList<>(Arrays.asList(rawActivationKey.split("")));
        String input = scanner.nextLine();

        while (!input.equals("Generate")) {
            String[] tokens = input.split(">>>");
            String command = tokens[0];
            switch (command) {
                case "Contains": {
                    String substring = tokens[1];
                    if (rawActivationKeyAsList.contains(substring)) {
                        System.out.printf("%s contains %s.%n", rawActivationKeyAsList, substring);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;
                }
                case "Flip": {
                    String upperOrLower = tokens[1];
                    int startIndex = Integer.parseInt(tokens[2]);
                    int endIndex = Integer.parseInt(tokens[3]);
                    for (int i = startIndex; i < endIndex; i++) {
                        if (upperOrLower.equals("Upper")) {
                            rawActivationKeyAsList.set(i, rawActivationKeyAsList.get(i).toUpperCase());
                        } else if (upperOrLower.equals("Lower")) {
                            rawActivationKeyAsList.set(i, rawActivationKeyAsList.get(i).toLowerCase());
                        }
                    }
                    System.out.println(String.join("", rawActivationKeyAsList));
                    break;
                }
                case "Slice": {
                    int startIndex = Integer.parseInt(tokens[1]);
                    int endIndex = Integer.parseInt(tokens[2]);
                    int indexForRemove = endIndex - startIndex;
                    while (indexForRemove > 0) {
                        rawActivationKeyAsList.remove(startIndex);
                        indexForRemove--;
                    }

                    System.out.println(String.join("", rawActivationKeyAsList));
                    break;
                }
            }
            input = scanner.nextLine();
        }

        System.out.print("Your activation key is: ");
        System.out.print(String.join("", rawActivationKeyAsList));

    }
}
