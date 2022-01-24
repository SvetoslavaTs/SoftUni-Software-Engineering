import java.util.Scanner;

public class Honeycombs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfBees = Integer.parseInt(scanner.nextLine());
        int numOfFlowers = Integer.parseInt(scanner.nextLine());

        double honeyInGrams = numOfBees * numOfFlowers * 0.21;
        double honeyCombsFilled = Math.floor(honeyInGrams / 100);
        double honeyLeft = honeyCombsFilled * 100;
        System.out.printf("%.0f honeycombs filled.%n", honeyCombsFilled);
        System.out.printf("%.2f grams of honey left.", honeyInGrams - honeyLeft);
    }
}
