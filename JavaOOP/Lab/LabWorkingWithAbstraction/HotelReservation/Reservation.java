package LabWorkingWithAbstraction.HotelReservation;

public class Reservation {
    private double pricePerDay;
    private int numberOfDays;
    private Season season;
    private DiscountType discountType;

    public Reservation(double pricePerDay, int numberOfDays, Season season, DiscountType discountType) {
        this.pricePerDay = pricePerDay;
        this.numberOfDays = numberOfDays;
        this.season = season;
        this.discountType = discountType;
    }

    public double calculatePrice() {
        double price = pricePerDay * numberOfDays;
        price = season.multipliedPrice(price);
        price = discountType.discountedPrice(price);
        return price;
    }
}
