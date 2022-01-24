import java.util.Scanner;

public class BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int junior = Integer.parseInt(scanner.nextLine());
        int senior = Integer.parseInt(scanner.nextLine());
        String trace = scanner.nextLine();
        double total = 0;

        switch (trace) {
            case "trail":
                total = (junior * 5.5 + senior * 7) * 0.95;
                break;
            case "cross-country":
                int juniorSenior = junior + senior;
                total = (junior * 8 + senior * 9.5);
                if (juniorSenior >= 50) {
                    total = (total * 0.75) * 0.95;
                } else {
                    total *= 0.95;
                }
                break;
            case "downhill":
                total = (junior * 12.25 + senior * 13.75) * 0.95;
                break;
            case "road":
                total = (junior * 20 + senior * 21.50) * 0.95;
                break;
        }
        System.out.printf("%.2f", total);

    }
}
