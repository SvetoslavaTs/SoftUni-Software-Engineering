import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double change = Double.parseDouble(scanner.nextLine());
        double changeInStotinki = Math.round(change * 100);
        int counter = 0;

        while (changeInStotinki > 0) {
            if (changeInStotinki >= 200) {
                changeInStotinki -= 200;
            } else if (changeInStotinki >= 100) {
                changeInStotinki -= 100;
            } else if (changeInStotinki >= 50) {
                changeInStotinki -= 50;
            } else if (changeInStotinki >= 20) {
                changeInStotinki -= 20;
            } else if (changeInStotinki >= 10) {
                changeInStotinki -= 10;
            } else if (changeInStotinki >= 5) {
                changeInStotinki -= 5;
            } else if (changeInStotinki >= 2) {
                changeInStotinki -= 2;
            } else if (changeInStotinki >= 1) {
                changeInStotinki -= 1;
            }
            counter++;
        }
        System.out.println(counter);
    }
}
