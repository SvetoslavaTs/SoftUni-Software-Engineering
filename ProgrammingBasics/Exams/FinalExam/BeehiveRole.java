import java.util.Scanner;

public class BeehiveRole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int intellect = Integer.parseInt(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());
        String male = scanner.nextLine();

        if (intellect >= 80 && power >= 80 && male.equals("female")) {
            System.out.println("Queen Bee");
        } else if (intellect >= 80) {
            System.out.println("Repairing Bee");
        } else if (intellect >= 60) {
            System.out.println("Cleaning Bee");
        } else if (power >= 80 && male.equals("male")) {
            System.out.println("Drone Bee");
        } else if (power >= 60) {
            System.out.println("Guard Bee");
        } else {
            System.out.println("Worker Bee");
        }
    }
}
