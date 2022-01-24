import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int high = Integer.parseInt(scanner.nextLine());
        String done = scanner.nextLine();
        int volume = width * length * high;

        while (!done.equals("Done")) {
            int box = Integer.parseInt(done);
            volume -= box;
            if (volume < 0) {
                System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(volume));
                break;
            }
            done = scanner.nextLine();
        }
        if (volume > 0) {
            System.out.printf("%d Cubic meters left.", volume);
        }
    }
}

