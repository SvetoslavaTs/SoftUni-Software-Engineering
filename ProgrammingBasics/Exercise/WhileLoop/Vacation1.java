import java.util.Scanner;

public class Vacation1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double neededMoney = Double.parseDouble(scanner.nextLine());
        double savedMoney = Double.parseDouble(scanner.nextLine());
        int totalCounter = 0;
        int spendCounter = 0;

        while (neededMoney > savedMoney && spendCounter < 5) {
            String saveSpend = scanner.nextLine();
            double currentMoney = Double.parseDouble(scanner.nextLine());
            totalCounter++;
            if (saveSpend.equals("save")) {
                savedMoney += currentMoney;
                spendCounter = 0;
            } else if (saveSpend.equals("spend")) {
                savedMoney -= currentMoney;
                spendCounter++;
                if (savedMoney < 0) {
                    savedMoney = 0;
                }
            }
        }
        if (spendCounter == 5) {
            System.out.println("You can't save the money.");
            System.out.println(totalCounter);
        }
        if (savedMoney >= neededMoney) {
            System.out.printf("You saved the money for %d days.", totalCounter);
        }
    }
}
