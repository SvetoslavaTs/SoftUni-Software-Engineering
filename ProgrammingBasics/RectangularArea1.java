import java.util.Scanner;

public class RectangularArea1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.next());
        int area = a * b;
        System.out.println(area);
    }
}
