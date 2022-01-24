import java.util.Scanner;

public class CelsiusOfFahrenheit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double TemperatureInCelsius = Double.parseDouble(scanner.nextLine());
        double TemperatureInFahrenheit = TemperatureInCelsius * 1.8D + 32.0D;
        System.out.printf("%.2f", TemperatureInFahrenheit);
    }
}
