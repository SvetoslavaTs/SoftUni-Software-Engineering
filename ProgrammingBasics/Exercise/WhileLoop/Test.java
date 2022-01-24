import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double neededMoney = Double.parseDouble(scanner.nextLine());
        double savedMoney = Double.parseDouble(scanner.nextLine());
        int totalCounter = 0;
        int spendCounter = 0;

        while (neededMoney > savedMoney) {
            String spendSave = scanner.nextLine();
            double currentMoney = Double.parseDouble(scanner.nextLine());
            totalCounter++;
            if (spendSave.equals("spend")) {
                spendCounter++;
                savedMoney -= currentMoney;
                if (savedMoney < 0) {
                    savedMoney = 0;
                }
                if (spendCounter == 5) {
                    System.out.println("You can't save the money.");
                    System.out.println(totalCounter);
                    break;
                }
            } else if (spendSave.equals("save")) {
                savedMoney += currentMoney;
                spendCounter = 0;
            }
        }
        if (neededMoney <= savedMoney) {
            System.out.printf("You saved the money for %d days.", totalCounter);
        }

    }
}