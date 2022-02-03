package SetsAndMaps;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashSet<String> carLot = new LinkedHashSet<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("END")) {
                break;
            } else {
                String[] reminder = input.split(", ");
                if (reminder[0].equals("IN")) {
                    carLot.add(reminder[1]);
                } else {
                    carLot.remove(reminder[1]);
                }
            }
        }
        if (carLot.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            carLot.forEach(System.out::println);
        }
    }
}
