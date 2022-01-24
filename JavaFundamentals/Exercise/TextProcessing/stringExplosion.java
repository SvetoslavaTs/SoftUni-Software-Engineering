package ExercisesTextProcessing;

import java.util.Scanner;

public class stringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder sb = new StringBuilder(scanner.nextLine());
        int strength = 0;

        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '>') {
                String current = String.valueOf(sb.charAt(i + 1));
                strength += Integer.parseInt(current);
            } else if (sb.charAt(i) != '>' && strength > 0) {
                sb.deleteCharAt(i);
                strength--;
                i--;
            }
        }
        System.out.println(sb);
    }
}
