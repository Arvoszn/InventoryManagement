package com.mycompany.oopactivity;

public class Room {

    protected int roomNumber;
    protected String roomType;
    protected String guestName;
    protected int numberOfNights;

    public Room(int roomNumber, String roomType, String guestName, int numberOfNights) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.guestName = guestName;
        this.numberOfNights = numberOfNights;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public double calculateBookingCost() {
        return 0;
    }

    public void displayBooking() {
        System.out.println("Room Type: " + roomType);
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Guest: " + guestName);
        System.out.println("Nights: " + numberOfNights);
        System.out.println(String.format("Booking Cost: ₱%,.2f", calculateBookingCost()));
        System.out.println();
    }
}
