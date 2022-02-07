package LabWorkingWithAbstraction.HotelReservation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        ReservationsInputDataParser parser = new ReservationsInputDataParser();
        Reservation reservation = parser.parsFromLine(line);

        double price = reservation.calculatePrice();
        Printer printer = new Printer(System.out);
        printer.printDoubleRounded(price);
    }
}
