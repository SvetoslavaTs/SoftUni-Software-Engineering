import java.util.Scanner;

public class FootballLeague {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stadiumCapacity = Integer.parseInt(scanner.nextLine());
        int numberOfFans = Integer.parseInt(scanner.nextLine());
        int sectorA = 0;
        int sectorB = 0;
        int sectorV = 0;
        int sectorG = 0;

        for (int i = 1; i <= numberOfFans; i++) {
            String sector = scanner.nextLine();
            if (sector.equals("A")) {
                sectorA += 1;
            } else if (sector.equals("B")) {
                sectorB += 1;
            } else if (sector.equals("V")) {
                sectorV += 1;
            } else if (sector.equals("G")) {
                sectorG += 1;
            }
        }
        System.out.printf("%.2f%%%n", 1.00 * sectorA / numberOfFans * 100);
        System.out.printf("%.2f%%%n", 1.00 * sectorB / numberOfFans * 100);
        System.out.printf("%.2f%%%n", 1.00 * sectorV / numberOfFans * 100);
        System.out.printf("%.2f%%%n", 1.00 * sectorG / numberOfFans * 100);
        System.out.printf("%.2f%%", 1.0 * numberOfFans / stadiumCapacity * 100);


    }
}
