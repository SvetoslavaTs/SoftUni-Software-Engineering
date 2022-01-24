import java.util.Scanner;

public class CruiseGames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int games = Integer.parseInt(scanner.nextLine());
        double pointsVolley = 0;
        double pointsTennis = 0;
        double pointsBadmin = 0;
        int counterVolley = 0;
        int counterTennis = 0;
        int counterBadmin = 0;

        for (int i = 1; i <= games; i++) {
            String gameName = scanner.nextLine();
            int points = Integer.parseInt(scanner.nextLine());
            if (gameName.equals("volleyball")) {
                pointsVolley += points + (points * 0.07);
                counterVolley++;
            } else if (gameName.equals("tennis")) {
                pointsTennis += points + (points * 0.05);
                counterTennis++;
            } else if (gameName.equals("badminton")) {
                pointsBadmin += points + (points * 0.02);
                counterBadmin++;
            }
        }
        double avarageVolley = pointsVolley / counterVolley;
        double avarageTennis = pointsTennis / counterTennis;
        double avarageBadmin = pointsBadmin / counterBadmin;
        if (avarageVolley >= 75 && avarageTennis >= 75 && avarageBadmin >= 75) {
            System.out.printf("Congratulations, %s! You won the cruise games with %.0f points.", name, Math.floor(pointsBadmin + pointsTennis + pointsVolley));
        } else {
            System.out.printf("Sorry, %s, you lost. Your points are only %.0f.", name, Math.floor(pointsBadmin + pointsTennis + pointsVolley));
        }

    }
}
