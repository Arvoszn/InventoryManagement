package com.mycompany.oopactivity;

public class Employee {

    private String employeeId;
    private String name;
    private String department;
    private int daysWorked;
    private double dailyRate;

    private static final int REGULAR_DAYS = 22;

    public Employee(String employeeId, String name, String department, int daysWorked, double dailyRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.daysWorked = daysWorked;
        this.dailyRate = dailyRate;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getDaysWorked() {
        return daysWorked;
    }

    public void setDaysWorked(int daysWorked) {
        this.daysWorked = daysWorked;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    public double calculateRegularPay() {
        int regularDays = Math.min(daysWorked, REGULAR_DAYS);
        return regularDays * dailyRate;
    }

    public double calculateOvertimePay() {
        if (daysWorked <= REGULAR_DAYS) {
            return 0;
        }
        int overtimeDays = daysWorked - REGULAR_DAYS;
        return overtimeDays * (dailyRate * 1.25);
    }

    public double calculateGrossPay() {
        return calculateRegularPay() + calculateOvertimePay();
    }

    public double calculateDeduction() {
        double grossPay = calculateGrossPay();
        if (grossPay <= 15000) {
            return grossPay * 0.05;
        }
        return grossPay * 0.08;
    }

    public double calculateNetPay() {
        return calculateGrossPay() - calculateDeduction();
    }

    public String getAttendanceClassification() {
        if (daysWorked < 15) {
            return "Poor Attendance";
        } else if (daysWorked >= 15 && daysWorked <= 21) {
            return "Incomplete Attendance";
        } else if (daysWorked == 22) {
            return "Complete Attendance";
        } else {
            return "Overtime Worker";
        }
    }

    public void displayPayroll() {
        System.out.println("===== EMPLOYEE PAYROLL =====");
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Days Worked: " + daysWorked);
        System.out.println(String.format("Daily Rate: ₱%,.2f", dailyRate));
        System.out.println(String.format("Regular Pay: ₱%,.2f", calculateRegularPay()));
        System.out.println(String.format("Overtime Pay: ₱%,.2f", calculateOvertimePay()));
        System.out.println(String.format("Gross Pay: ₱%,.2f", calculateGrossPay()));
        System.out.println(String.format("Deduction: ₱%,.2f", calculateDeduction()));
        System.out.println(String.format("Net Pay: ₱%,.2f", calculateNetPay()));
        System.out.println("Classification: " + getAttendanceClassification());
        System.out.println();
    }
}
