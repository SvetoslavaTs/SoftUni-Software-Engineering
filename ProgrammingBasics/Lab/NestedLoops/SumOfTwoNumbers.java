import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int magicalNum = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        boolean flag = false;

        for (int i = firstNumber; i <= secondNumber; i++) {
            for (int j = firstNumber; j <= secondNumber; j++) {
                counter++;
                if (i + j == magicalNum) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", counter, i, j, magicalNum);
                    flag = true;
                    break;
                }
            }
            if (flag)
                break;
        }
        if (!flag)
            System.out.printf("%d combinations - neither equals %d", counter, magicalNum);
    }
}
