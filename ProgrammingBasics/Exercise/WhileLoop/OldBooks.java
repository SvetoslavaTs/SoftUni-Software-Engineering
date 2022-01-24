import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String book = scanner.nextLine();
        int library = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        String enter = scanner.nextLine();

        while (!book.equals(enter)) {
            ++counter;
            if (counter >= library) {
                System.out.printf("The book you search is not here!%nYou checked %d books.", counter);
                break;
            }
            enter = scanner.nextLine();
        }
        if (book.equals(enter)) {
            System.out.printf("You checked %d books and found it.", counter);
        }
    }
}
