import java.util.Scanner;

public class Bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int months = Integer.parseInt(scanner.nextLine());
        double totalCosts = 0;
        double totalElectricity = 0;
        double totalWater = 0;
        double totalInternet = 0;
        double totalOthers = 0;

        for (int i = 1; i <= months; i++) {
            double electricity = Double.parseDouble(scanner.nextLine());
            totalElectricity += electricity;
            totalWater += 20;
            totalInternet += 15;
            totalOthers += electricity + 15 + 20 + (electricity + 15 + 20) * 0.2;
            totalCosts += electricity + 20 + 15 + electricity + 35 + (electricity + 20 + 15) * 0.2;
        }

        System.out.printf("Electricity: %.2f lv%n", totalElectricity);
        System.out.printf("Water: %.2f lv%n", totalWater);
        System.out.printf("Internet: %.2f lv%n", totalInternet);
        System.out.printf("Other: %.2f lv%n", totalOthers);
        System.out.printf("Average: %.2f lv", totalCosts / months);
    }
}
