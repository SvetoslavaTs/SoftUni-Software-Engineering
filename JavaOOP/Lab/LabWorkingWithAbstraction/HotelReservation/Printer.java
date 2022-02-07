package LabWorkingWithAbstraction.HotelReservation;

import java.io.PrintStream;

public class Printer {
    private PrintStream out;

    public Printer(PrintStream out) {
        this.out = out;
    }

    public void printLine(String line) {
        out.println(line);
    }

    public void printDoubleRounded(double price) {
        out.printf("%.2f", price);
    }
}
