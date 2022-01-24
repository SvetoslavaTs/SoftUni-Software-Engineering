import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int cake = width * length;
        String stop = scanner.nextLine();

        while (!stop.equals("STOP")) {
            int pieces = Integer.parseInt(stop);
            cake -= pieces;
            if (cake <= 0) {
                System.out.printf("No more cake left! You need %d pieces more.", Math.abs(cake));
                break;
            }
            stop = scanner.nextLine();
        }
        if (cake >= 0) {
            System.out.printf("%d pieces are left.", cake);
        }
    }
}
