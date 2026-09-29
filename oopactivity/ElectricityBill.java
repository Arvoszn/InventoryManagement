package com.mycompany.oopactivity;

public class ElectricityBill {

    private String accountNumber;
    private String customerName;
    private String customerType;
    private double previousReading;
    private double currentReading;

    public ElectricityBill(String accountNumber, String customerName, String customerType,
            double previousReading, double currentReading) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.customerType = customerType;
        this.previousReading = previousReading;
        this.currentReading = currentReading;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public double getPreviousReading() {
        return previousReading;
    }

    public void setPreviousReading(double previousReading) {
        this.previousReading = previousReading;
    }

    public double getCurrentReading() {
        return currentReading;
    }

    public void setCurrentReading(double currentReading) {
        this.currentReading = currentReading;
    }

    public double calculateConsumption() {
        return currentReading - previousReading;
    }

    public double getRate() {
        double consumption = calculateConsumption();

        if ("Residential".equalsIgnoreCase(customerType)) {
            if (consumption <= 100) {
                return 10;
            } else if (consumption <= 200) {
                return 12;
            } else {
                return 15;
            }
        } else if ("Commercial".equalsIgnoreCase(customerType)) {
            if (consumption <= 100) {
                return 15;
            } else if (consumption <= 200) {
                return 18;
            } else {
                return 22;
            }
        }

        return 0;
    }

    public double calculateBill() {
        return calculateConsumption() * getRate();
    }

    public String getClassification() {
        double consumption = calculateConsumption();

        if (consumption < 100) {
            return "Low Consumption";
        } else if (consumption <= 200) {
            return "Moderate Consumption";
        } else {
            return "High Consumption";
        }
    }

    public void displayBill() {
        System.out.println("===== ELECTRICITY BILL =====");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer Type: " + customerType);
        System.out.println("Previous Reading: " + (int) previousReading);
        System.out.println("Current Reading: " + (int) currentReading);
        System.out.println("Consumption: " + (int) calculateConsumption() + " kWh");
        System.out.println(String.format("Rate: ₱%,.2f", getRate()));
        System.out.println(String.format("Total Bill: ₱%,.2f", calculateBill()));
        System.out.println("Classification: " + getClassification());
        if (calculateConsumption() > 300) {
            System.out.println("WARNING: VERY HIGH ELECTRICITY CONSUMPTION");
        }
        System.out.println();
    }
}
