import java.util.Scanner;

public class Trapezoid {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double b1 = Double.parseDouble(scanner.nextLine());
        double b2 = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        double S = (b1 + b2) * h / 2.0;
        System.out.printf("%.2f", S);
    }
}
