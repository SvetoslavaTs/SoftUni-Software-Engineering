import java.util.Scanner;

public class ReadText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int count = 0;

        while (!text.equals("Stop")) {
            text = scanner.nextLine();
            count++;
        }
        System.out.println(count);
    }
}
