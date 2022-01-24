import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double amount = Double.parseDouble(scanner.nextLine());
        double total = 0;

        if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday")) {
            switch (fruit) {
                case "banana":
                    total = amount * 2.50;
                    break;
                case "apple":
                    total = amount * 1.20;
                    break;
                case "orange":
                    total = amount * 0.85;
                    break;
                case "grapefruit":
                    total = amount * 1.45;
                    break;
                case "kiwi":
                    total = amount * 2.70;
                    break;
                case "pineapple":
                    total = amount * 5.50;
                    break;
                case "grapes":
                    total = amount * 3.85;
                    break;
                default:
                    System.out.println("error");
                    break;
            }

        } else if (day.equals("Saturday") || day.equals("Sunday")) {
            switch (fruit) {
                case "banana":
                    total = amount * 2.70;
                    break;
                case "apple":
                    total = amount * 1.25;
                    break;
                case "orange":
                    total = amount * 0.90;
                    break;
                case "grapefruit":
                    total = amount * 1.60;
                    break;
                case "kiwi":
                    total = amount * 3.00;
                    break;
                case "pineapple":
                    total = amount * 5.60;
                    break;
                case "grapes":
                    total = amount * 4.20;
                    break;
                default:
                    System.out.println("error");
                    break;
            }

        } else {
            System.out.println("error");
        }

        if (total != 0) {
            System.out.printf("%.2f", total);
        }
    }
}
