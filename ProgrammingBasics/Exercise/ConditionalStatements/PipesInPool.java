import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int volume = Integer.parseInt(scanner.nextLine());
        int p1FlowRate = Integer.parseInt(scanner.nextLine());
        int p2FlowRate = Integer.parseInt(scanner.nextLine());
        double hoursFilling = Double.parseDouble(scanner.nextLine());

        double volume2 = p1FlowRate * hoursFilling + p2FlowRate * hoursFilling;
        double p1Liters = p1FlowRate * hoursFilling;
        double p2litres = p2FlowRate * hoursFilling;
        double p1FlowRatePerCent = (p1Liters / volume2) * 100;
        double p2FlowRatePerCent = (p2litres / volume2) * 100;
        double volume2InPerCent = (volume2 / volume) * 100;

        if (volume2 <= volume) {
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%", volume2InPerCent, p1FlowRatePerCent, p2FlowRatePerCent);
        } else {
            double overflow = volume2 - volume;
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", hoursFilling, overflow);
        }

    }
}
