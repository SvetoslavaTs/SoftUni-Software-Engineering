import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double distanceIn = Double.parseDouble(scanner.nextLine());
        String unitOfMeasureIn = scanner.nextLine();
        String unitOfMeasureOut = scanner.nextLine();
        double distanceOut = 0.0;

        if (unitOfMeasureIn.equals("cm")) {
            distanceIn = distanceIn / 100;
        } else if (unitOfMeasureIn.equals("mm")) {
            distanceIn = distanceIn / 1000;
        }
        if (unitOfMeasureOut.equals("m")) {
            System.out.printf("%.3f", distanceIn);
        } else if (unitOfMeasureOut.equals("cm")) {
            distanceOut = distanceIn * 100;
            System.out.printf("%.3f", distanceOut);
        } else if (unitOfMeasureOut.equals("mm")) {
            distanceOut = distanceIn * 1000;
            System.out.printf("%.3f", distanceOut);
        }
    }
}

