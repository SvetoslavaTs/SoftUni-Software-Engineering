import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double perCent = Double.parseDouble(scanner.nextLine());
        double volumeDm3 = (length * width * height) * 0.001;
        double usedVolumeDm3 = volumeDm3 * (perCent / 100);
        double residualVolumeDm3 = volumeDm3 - usedVolumeDm3;
        System.out.printf("%.3f ", residualVolumeDm3);

    }
}

