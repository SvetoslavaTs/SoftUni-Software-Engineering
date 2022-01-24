import java.util.Scanner;

public class InvalidNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        boolean invalid = ((number >= 100) && (number <= 200) || (number == 0));

        if (!invalid) {
            System.out.println("invalid");
        }
    }
}
