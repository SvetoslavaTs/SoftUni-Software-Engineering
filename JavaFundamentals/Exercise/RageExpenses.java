package ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lostGamesCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        double rageCosts = 0;
        int countHeadset = 0;
        int countMouse = 0;
        int countKeyboard = 0;
        boolean head = false;
        boolean mouse = false;

        for (int i = 1; i <= lostGamesCount; i++) {
            countHeadset++;
            countMouse++;
            if (countHeadset == 2) {
                rageCosts += headsetPrice;
                countHeadset = 0;
                head = true;
            } else {
                head = false;
            }
            if (countMouse == 3) {
                rageCosts += mousePrice;
                countMouse = 0;
                mouse = true;
            } else {
                mouse = false;
            }
            if (head && mouse) {
                rageCosts += keyboardPrice;
                countKeyboard++;
            }
            if (countKeyboard == 2) {
                rageCosts += displayPrice;
                countKeyboard = 0;
            }
        }
        System.out.printf("Rage expenses: %.2f lv.", rageCosts);


    }
}
