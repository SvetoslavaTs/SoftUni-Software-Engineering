package LabWorkingWithAbstraction.HotelReservation;

public class ReservationsInputDataParser {

    public Reservation parsFromLine(String line) {
        String[] split = line.split("\\s+");
        double pricePerDay = Double.parseDouble(split[0]);
        int numberOfDays = Integer.parseInt(split[1]);
        Season season = Season.valueOf(split[2].toUpperCase());
        DiscountType discountType = DiscountType.valueOf(split[3].toUpperCase());
        return new Reservation(pricePerDay, numberOfDays, season, discountType);
    }

}
