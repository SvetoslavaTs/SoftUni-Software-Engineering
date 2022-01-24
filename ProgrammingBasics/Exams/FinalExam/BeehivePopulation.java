import java.util.Scanner;

public class BeehivePopulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int populationStart = Integer.parseInt(scanner.nextLine());
        int years = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= years; i++) {
            populationStart = populationStart + (populationStart / 10 * 2);
            if (i % 5 == 0) {
                populationStart = populationStart - (populationStart / 50 * 5);
            }
            populationStart = populationStart - (populationStart / 20 * 2);
        }
        System.out.printf("Beehive population: %d", populationStart);
    }
}
