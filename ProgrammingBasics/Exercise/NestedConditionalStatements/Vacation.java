import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String location = "";
        String type = "";

        if (budget <= 1000) {
            if (season.equals("Summer")) {
                type = "Camp";
                location = "Alaska";
                budget = budget * 0.65;
            } else if (season.equals("Winter")) {
                type = "Camp";
                location = "Morocco";
                budget = budget * 0.45;
            }
        } else if (budget > 1000 && budget <= 3000) {
            if (season.equals("Summer")) {
                type = "Hut";
                location = "Alaska";
                budget = budget * 0.8;
            } else if (season.equals("Winter")) {
                type = "Hut";
                location = "Morocco";
                budget = budget * 0.6;
            }
        } else if (budget > 3000) {
            if (season.equals("Summer")) {
                type = "Hotel";
                location = "Alaska";
                budget = budget * 0.9;
            } else if (season.equals("Winter")) {
                type = "Hotel";
                location = "Morocco";
                budget = budget * 0.9;
            }
        }
        System.out.printf("%s - %s - %.2f", location, type, budget);

    }

}
