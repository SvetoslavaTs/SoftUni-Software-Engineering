package ExerciseArrays;

import java.util.Scanner;

public class arrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());
        String[] nums = input.split(" ");
        for (int i = 0; i < n; i++) {
            String firstNum = nums[0];
            for (int j = 0; j < nums.length - 1; j++) {
                nums[j] = nums[j + 1];
            }
            nums[nums.length - 1] = firstNum;
        }
        System.out.println(String.join(" ", nums));
    }
}
