import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalSteps = 0;

        while (totalSteps < 10000) {
            String goingHome = scanner.nextLine();
            if (goingHome.equals("Going home")) {
                int steps = Integer.parseInt(scanner.nextLine());
                totalSteps += steps;
                break;
            } else {
                totalSteps += Integer.parseInt(goingHome);
            }
        }

        if (totalSteps >= 10000) {
            System.out.println("Goal reached! Good job!");
        } else {
            System.out.printf("%d more steps to reach goal.", 10000 - totalSteps);
        }
    }
}
