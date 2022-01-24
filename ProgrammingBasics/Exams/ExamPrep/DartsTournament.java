import java.util.Scanner;

public class DartsTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int points = Integer.parseInt(scanner.nextLine());
        int moveCounter = 0;
        int totalPoints = points;


        while (totalPoints > 0) {
            String sector = scanner.nextLine();
            moveCounter++;
            if (sector.equals("bullseye")) {
                System.out.printf("Congratulations! You won the game with a bullseye in %d moves!", moveCounter);
                break;
            }
            int currentPoints = Integer.parseInt(scanner.nextLine());

            if (sector.equals("number section")) {
                totalPoints -= currentPoints;
            } else if (sector.equals("double ring")) {
                totalPoints -= 2 * currentPoints;
            } else if (sector.equals("triple ring")) {
                totalPoints -= 3 * currentPoints;
            }
        }

        if (totalPoints == 0) {
            System.out.printf("Congratulations! You won the game in %d moves!", moveCounter);
        } else if (totalPoints < 0) {
            System.out.printf("Sorry, you lost. Score difference: %d.", Math.abs(totalPoints));
        }
    }
}


