import java.util.Scanner;

public class Dishwasher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bottlesDetergent = Integer.parseInt(scanner.nextLine());
        String end = scanner.nextLine();
        int detergentInMl = bottlesDetergent * 750;
        int counter = 0;
        int counterDishes = 0;
        int counterPots = 0;


        while (!end.equals("End")) {
            int dishesPots = Integer.parseInt(end);
            counter++;
            if (counter <= 2) {
                detergentInMl -= dishesPots * 5;
                counterDishes += dishesPots;
            } else if (counter == 3) {
                detergentInMl -= dishesPots * 15;
                counterPots += dishesPots;
                counter = 0;
            }
            if (detergentInMl < 0) {
                System.out.printf("Not enough detergent, %d ml. more necessary!", Math.abs(detergentInMl));
                break;
            }
            end = scanner.nextLine();
        }
        if (detergentInMl >= 0) {
            System.out.println("Detergent was enough!");
            System.out.printf("%d dishes and %d pots were washed.%n", counterDishes, counterPots);
            System.out.printf("Leftover detergent %d ml.", detergentInMl);
        }

    }
}
