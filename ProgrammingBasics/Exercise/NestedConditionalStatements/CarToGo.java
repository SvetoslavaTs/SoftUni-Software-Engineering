import java.lang.reflect.Parameter;
import java.util.Scanner;

public class CarToGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String clas = "";
        String type = "";

        if (budget <= 100) {
            if (season.equals("Summer")) {
                clas = "Economy class";
                budget = budget * 0.35;
                type = "Cabrio";
            } else if (season.equals("Winter")) {
                clas = "Economy class";
                budget = budget * 0.65;
                type = "Jeep";
            }
        } else if (budget > 100 && budget <= 500) {
            if (season.equals("Summer")) {
                clas = "Compact class";
                budget = budget * 0.45;
                type = "Cabrio";
            } else if (season.equals("Winter")) {
                clas = "Compact class";
                budget = budget * 0.8;
                type = "Jeep";
            }
        } else if (budget > 500) {
            clas = "Luxury class";
            budget = budget * 0.9;
            type = "Jeep";
        }
        System.out.printf("%s%n%s - %.2f", clas, type, budget);

    }
}
