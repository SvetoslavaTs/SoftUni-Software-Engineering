import java.util.Scanner;

public class Plus15Min {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt(scanner.nextLine());
        min += 15;

        if (min >= 60) {
            min -= 60;
            hour += 1;
        }
        if (hour >= 24) {
            hour = 0;
        }
        if (min < 10) {
            System.out.printf("%d:0%d", hour, min);
        } else {
            System.out.printf("%d:%d", hour, min);
        }

    }
}
