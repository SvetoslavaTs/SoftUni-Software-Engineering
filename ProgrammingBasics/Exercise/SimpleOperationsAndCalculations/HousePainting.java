import java.util.Scanner;

public class HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double frontBackWalls = 2 * (x * x) - 1.2 * 2;
        double sideWalls = 2 * (x * y) - 2 * (1.5 * 1.5);
        double greenPaintInLitres = (frontBackWalls + sideWalls) / 3.4;
        double frontBackWallAttic = 2 * (x * h / 2);
        double sideWallsAttic = 2 * (x * y);
        double redPaintInLitres = (frontBackWallAttic + sideWallsAttic) / 4.3;
        System.out.printf("%.2f %n %.2f", greenPaintInLitres, redPaintInLitres);

    }
}
