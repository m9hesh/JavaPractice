package com.javapractice;

public class Employee {
    // Static variables
    private static int eid;
    private static String ename;
    private static String companyName;

    // Static method to set employee details
    public static void setEmployeeDetails(int id, String name, String company) {
        eid = id;
        ename = name;
        companyName = company;
    }

    // Static method to get employee id
    public static int getEid() {
        return eid;
    }

    // Static method to get employee name
    public static String getEname() {
        return ename;
    }

    // Static method to get company name
    public static String getCompanyName() {
        return companyName;
    }

    // Static method to display employee details
    public static void displayEmployeeDetails() {
        System.out.println("Employee ID: " + eid);
        System.out.println("Employee Name: " + ename);
        System.out.println("Company Name: " + companyName);
    }

    public static void main(String[] args) {
        // Set employee details
        setEmployeeDetails(101, "Mahesh", "JP Morgan");

        // Display employee details
        displayEmployeeDetails();
    }
}

