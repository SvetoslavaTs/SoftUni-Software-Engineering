import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        String stop = scanner.nextLine();

        while (!stop.equals("Stop")) {
            int number = Integer.parseInt(stop);
            sum += number;
            stop = scanner.nextLine();
        }
        System.out.printf("%d", sum);
    }
}
