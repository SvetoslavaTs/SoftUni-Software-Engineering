import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());

        double sideA = Math.abs(x1 - x2);
        double sideB = Math.abs(y1 - y2);
        System.out.printf("%.2f %n", sideA * sideB);
        System.out.printf("%.2f", 2 * (sideA + sideB));
    }
}

