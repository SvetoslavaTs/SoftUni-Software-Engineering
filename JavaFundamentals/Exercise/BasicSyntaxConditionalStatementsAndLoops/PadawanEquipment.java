package ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double priceSaber = Double.parseDouble(scanner.nextLine());
        double priceRobe = Double.parseDouble(scanner.nextLine());
        double priceBelt = Double.parseDouble(scanner.nextLine());

        int freeBelts = students / 6;
        double studentSaber = Math.ceil(students * 1.1);
        double total = (studentSaber * priceSaber) + (students * priceRobe) + ((students - freeBelts) * priceBelt);

        if (budget >= total) {
            System.out.printf("The money is enough - it would cost %.2flv.", total);
        } else {
            System.out.printf("Ivan Cho will need %.2f lv more.", total - budget);

        }
    }
}

