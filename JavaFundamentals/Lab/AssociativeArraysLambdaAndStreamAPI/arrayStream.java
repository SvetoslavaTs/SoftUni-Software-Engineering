package AssociativeArraysLambdaAndStreamAPI;

import java.util.*;

public class arrayStream {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .filter(n -> n > 0)
                .toArray();

        for (int num : nums) {
            System.out.println(num + " ");
        }
    }
}
