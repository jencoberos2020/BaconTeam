package com.bacon.workshop.Employee;

public class EmployeeMain {

    public static void main(String[] args) {
        Employee employee = new Employee("Juan", "Luna", "Dela Cruz", 25);
        System.out.println("My Name is " + employee.getFirstName() + " " + employee.getMiddleName() + " " + employee.getLastName() + ". I am " + employee.getAge() + " years old.");
        System.out.println("My birth year is " + employee.getBirthYear());
        System.out.println(employee.getEmployeeName());
        System.out.println(employee.getEmployeeFullName());
    }
}
