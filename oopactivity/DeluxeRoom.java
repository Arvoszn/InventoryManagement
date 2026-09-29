package com.mycompany.oopactivity;

public class DeluxeRoom extends Room {

    private static final double DAILY_RATE = 2500;
    private static final double BREAKFAST_FEE = 300;

    public DeluxeRoom(int roomNumber, String guestName, int numberOfNights) {
        super(roomNumber, "Deluxe", guestName, numberOfNights);
    }

    @Override
    public double calculateBookingCost() {
        return (DAILY_RATE * numberOfNights) + (BREAKFAST_FEE * numberOfNights);
    }
}
