package LabObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class demo {
    static class Reservation {
        String holderName;
        String phoneNumber;
        int seats;

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Reservation> reservations = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            Reservation r = new Reservation();
            String[] nameAndSeats = input.split(" ");
            r.holderName = nameAndSeats[0];
            r.phoneNumber = nameAndSeats[1];
            r.seats = Integer.parseInt(nameAndSeats[2]);
            reservations.add(r);

            input = scanner.nextLine();
        }
        String guestName = scanner.nextLine();
        int indexOfReservation = -1;
        for (int i = 0; i < reservations.size(); i++) {
            Reservation reservation = reservations.get(i);
            if (guestName.equals(reservation.holderName)) {
                indexOfReservation = i;
                break;
            }
        }
        if (indexOfReservation != -1) {
            Reservation reservation = reservations.get(indexOfReservation);
            System.out.println(reservation.seats);
        } else {
            System.out.println("Sorry, no reservation for " + guestName);
        }
    }
}
