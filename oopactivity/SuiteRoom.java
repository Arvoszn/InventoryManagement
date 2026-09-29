package com.mycompany.oopactivity;

public class SuiteRoom extends Room {

    private static final double DAILY_RATE = 4000;
    private static final double SERVICE_FEE = 1000;

    public SuiteRoom(int roomNumber, String guestName, int numberOfNights) {
        super(roomNumber, "Suite", guestName, numberOfNights);
    }

    @Override
    public double calculateBookingCost() {
        return (DAILY_RATE * numberOfNights) + SERVICE_FEE;
    }
}
