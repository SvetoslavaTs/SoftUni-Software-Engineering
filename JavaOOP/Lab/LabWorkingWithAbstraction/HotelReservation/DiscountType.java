package LabWorkingWithAbstraction.HotelReservation;

public enum DiscountType {
    VIP(0.2),
    SECONDVISIT(0.1),
    NONE(0);

    private double discount;

    DiscountType(double discount) {
        this.discount = discount;
    }

    public double discountedPrice(double price) {
        double currentDiscount = price * this.discount;
        return price - currentDiscount;
    }

}
