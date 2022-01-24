import java.util.Scanner;

public class HoneyWinterReserves {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double neededHoney = Double.parseDouble(scanner.nextLine());
        String nameBee = scanner.nextLine();
        double totalHoney = 0;
        boolean flag = true;

        while (!nameBee.equals("Winter has come")) {
            double amountHoneyPerBee = 0;
            for (int i = 1; i <= 6; i++) {
                double currentHoney = Double.parseDouble(scanner.nextLine());
                amountHoneyPerBee += currentHoney;
            }
            if (amountHoneyPerBee < 0) {
                System.out.printf("%s was banished for gluttony%n", nameBee);
            }
            if (totalHoney >= neededHoney) {
                break;
            }
            totalHoney += amountHoneyPerBee;
            nameBee = scanner.nextLine();
        }
        if (totalHoney >= neededHoney) {
            System.out.printf("Well done! Honey surplus %.2f.", Math.abs(totalHoney - neededHoney));
        } else {
            System.out.printf("Hard Winter! Honey needed %.2f.", Math.abs(neededHoney - totalHoney));
        }
    }
}
