import java.util.Scanner;

public class InchesToCentimeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double inch = Double.parseDouble(scanner.nextLine());
        Double cm = inch * 2.54;
        System.out.println(cm);
    }
}
