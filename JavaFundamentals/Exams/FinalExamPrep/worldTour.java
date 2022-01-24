package prepFinalExam;

import java.util.Scanner;

public class worldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder input = new StringBuilder(scanner.nextLine());
        String commands = scanner.nextLine();

        while (!commands.equals("Travel")) {
            String[] tokens = commands.split(":");
            String command = tokens[0];

            switch (command) {
                case "Add Stop":
                    int index = Integer.parseInt(tokens[1]);
                    String stop = tokens[2];
                    if (index >= 0 && index < input.length()) {
                        input.insert(index, stop);
                    }

                    break;
                case "Remove Stop":
                    int startIndex = Integer.parseInt(tokens[1]);
                    int endIndex = Integer.parseInt(tokens[2]);
                    if ((startIndex >= 0 && startIndex < input.length())
                            && (endIndex >= 0 && endIndex < input.length())) {
                        input.replace(startIndex, endIndex + 1, "");
                    }

                    break;
                case "Switch":
                    String oldString = tokens[1];
                    String newString = tokens[2];
                    input = new StringBuilder(input.toString().replace(oldString, newString));
                    break;
                default:
                    System.out.println(command);

            }
            System.out.println(input);
            commands = scanner.nextLine();
        }
        System.out.println("Ready for world tour! Planned stops: " + input);
    }
}
