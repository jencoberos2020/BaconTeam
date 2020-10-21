package com.bacon.workshop.Employee;

public class Employee {
    private String firstName;
    private String middleName;
    private String lastName;
    private int age;

    private int birthYear;
    private String employeeName;
    private String employeeFullName;

    public Employee(String firstName, String middleName, String lastName, int age) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;

        this.birthYear = getBirthYear(age);
        this.employeeName = displayFullName(firstName, lastName);
        this.employeeFullName = displayFullName(firstName, middleName, lastName);
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeFullName() {
        return employeeFullName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int getBirthYear (int age) {
        int yearNow = 2020;
        int birthYear = yearNow - age;

        return birthYear;
    }

    private String displayFullName (String firstName, String lastName) {
        return "My name is " + firstName + " " + lastName;
    }

    private String displayFullName (String firstName, String middleName, String lastName) {
        return "My full name is " + firstName + " " + middleName + " " + lastName;
    }
}
