import java.util.Scanner;

public class FishTank1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double perCent = Double.parseDouble(scanner.nextLine());
        double volumeDm3 = (length * width * height) * 0.001;
        double residualVolumeDm3 = volumeDm3 * (1 - perCent / 100);
        System.out.printf("%.3f ", residualVolumeDm3);

    }
}