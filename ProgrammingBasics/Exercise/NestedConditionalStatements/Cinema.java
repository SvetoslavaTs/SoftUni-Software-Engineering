import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String typeCinema = scanner.nextLine();
        int r = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        double total = 0;

        switch (typeCinema) {
            case "Premiere":
                total = r * c * 12;
                break;
            case "Normal":
                total = r * c * 7.5;
                break;
            case "Discount":
                total = r * c * 5;
                break;
        }
        System.out.printf("%.2f leva", total);
    }
}
