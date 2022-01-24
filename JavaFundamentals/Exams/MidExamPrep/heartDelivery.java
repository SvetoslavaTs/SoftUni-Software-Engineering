package midExamPrep;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class heartDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = Arrays.stream(scanner.nextLine().split("@"))
                .map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();
        int currentPosition = 0;
        while (!input.equals("Love!")) {
            String[] tokens = input.split(" ");
            int jumpLength = Integer.parseInt(tokens[1]);
            currentPosition += jumpLength;
            if (currentPosition > list.size() - 1) {
                currentPosition = 0;
            }
            if (list.get(currentPosition) == 0) {
                System.out.printf("Place %d already had Valentine's day.%n", currentPosition);
            } else if (list.get(currentPosition) - 2 == 0) {
                System.out.printf("Place %d has Valentine's day.%n", currentPosition);
                list.set(currentPosition, list.get(currentPosition) - 2);
            } else {
                list.set(currentPosition, list.get(currentPosition) - 2);
            }
            input = scanner.nextLine();
        }
        System.out.printf("Cupid's last position was %d.%n", currentPosition);
        boolean isSuccessful = true;
        int houseCount = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != 0) {
                isSuccessful = false;
                houseCount++;
            }
        }
        if (isSuccessful) {
            System.out.println("Mission was successful.");
        } else {
            System.out.printf("Cupid has failed %d places.", houseCount);
        }

    }
}
