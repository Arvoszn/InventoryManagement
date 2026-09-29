/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.oopactivity;

/**
 *
 * @author Reuben
 */
public class OOPActivity {

    public static void main(String[] args) {
        productInventoryDemo();
        electricityBillDemo();
        employeePayrollDemo();
        hotelBookingDemo();
    }

    private static void productInventoryDemo() {
        Product product = new Product("P-1001", "Wireless Mouse", "Computer Accessories", 850.00, 25);
        product.displayProductInfo();

        Product lowStock = new Product("P-1002", "USB Cable", "Computer Accessories", 150.00, 5);
        lowStock.displayProductInfo();

        Product outOfStock = new Product("P-1003", "Mechanical Keyboard", "Computer Accessories", 2500.00, 0);
        outOfStock.displayProductInfo();

        Product highStock = new Product("P-1004", "Ballpen", "School Supplies", 25.00, 120);
        highStock.displayProductInfo();
    }

    private static void electricityBillDemo() {
        ElectricityBill bill1 = new ElectricityBill("EL-1001", "Juan Santos", "Residential", 1250, 1475);
        bill1.displayBill();

        ElectricityBill bill2 = new ElectricityBill("EL-1002", "Ana Reyes", "Residential", 3000, 3150);
        bill2.displayBill();

        ElectricityBill bill3 = new ElectricityBill("EL-1003", "ABC Corporation", "Commercial", 8200, 8550);
        bill3.displayBill();
    }

    private static void employeePayrollDemo() {
        Employee emp1 = new Employee("EMP-001", "Maria Cruz", "IT", 25, 700.00);
        emp1.displayPayroll();

        Employee emp2 = new Employee("EMP-002", "Jose Rizal", "Accounting", 22, 650.00);
        emp2.displayPayroll();

        Employee emp3 = new Employee("EMP-003", "Ana Luna", "HR", 12, 500.00);
        emp3.displayPayroll();
    }

    private static void hotelBookingDemo() {
        System.out.println("===== HOTEL BOOKING =====");
        System.out.println();

        Room[] rooms = {
            new StandardRoom(101, "Pedro Cruz", 3),
            new DeluxeRoom(202, "Ana Reyes", 2),
            new SuiteRoom(301, "Carlo Santos", 2)
        };

        for (Room room : rooms) {
            room.displayBooking();
        }
    }
}
