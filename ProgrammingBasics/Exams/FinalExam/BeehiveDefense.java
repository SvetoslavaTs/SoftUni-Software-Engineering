import java.util.Scanner;

public class BeehiveDefense {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bees = Integer.parseInt(scanner.nextLine());
        int healthBear = Integer.parseInt(scanner.nextLine());
        int attack = Integer.parseInt(scanner.nextLine());

        while (bees >= 100) {
            bees = bees - attack;
            healthBear = healthBear - (bees * 5);
            if (healthBear <= 0) {
                System.out.printf("Beehive won! Bees left %d.", bees);
                break;
            }
        }
        if (bees < 100 && bees >= 0) {
            System.out.printf("The bear stole the honey! Bees left %d.", bees);
        } else if (bees < 0) {
            System.out.println("The bear stole the honey! Bees left 0.");
        }
    }
}
