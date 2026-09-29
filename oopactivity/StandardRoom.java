package com.mycompany.oopactivity;

public class StandardRoom extends Room {

    private static final double DAILY_RATE = 1500;

    public StandardRoom(int roomNumber, String guestName, int numberOfNights) {
        super(roomNumber, "Standard", guestName, numberOfNights);
    }

    @Override
    public double calculateBookingCost() {
        return DAILY_RATE * numberOfNights;
    }
}
