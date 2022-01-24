import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        String pass = scanner.nextLine();

        String enterPass = scanner.nextLine();
        while (!enterPass.equals(pass)) {
            enterPass = scanner.nextLine();
        }
        System.out.println("Welcome " + userName + "!");

    }
}
