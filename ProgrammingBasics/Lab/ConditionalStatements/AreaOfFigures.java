import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figure = scanner.nextLine();


        if (figure.equals("square")) {
            double squareSide = Double.parseDouble(scanner.nextLine());
            double squareArea = squareSide * squareSide;
            System.out.printf("%.3f", squareArea);
        } else if (figure.equals("rectangle")) {
            double rectangleSide = Double.parseDouble(scanner.nextLine());
            double rectangleSide1 = Double.parseDouble(scanner.nextLine());
            double rectangleArea = rectangleSide * rectangleSide1;
            System.out.printf("%.3f", rectangleArea);
        } else if (figure.equals("circle")) {
            double circleRadius = Double.parseDouble(scanner.nextLine());
            double circleArea = circleRadius * circleRadius * Math.PI;
            System.out.printf("%.3f", circleArea);
        } else if (figure.equals("triangle")) {
            double triangleSide = Double.parseDouble(scanner.nextLine());
            double triangleHigh = Double.parseDouble(scanner.nextLine());
            double triangleArea = triangleSide * triangleHigh / 2;
            System.out.printf("%.3f", triangleArea);

        }

    }

}

