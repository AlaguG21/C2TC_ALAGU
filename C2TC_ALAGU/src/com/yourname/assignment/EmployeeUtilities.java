package com.yourname.assignment;
public class EmployeeUtilities{
    public void displayEmployeeDetails(Employee employee) {
        System.out.println("Name: " + employee.getName());
        System.out.println("ID: " + employee.getEmployeeId());
        System.out.println("Salary: " + employee.getSalary());

        if (employee instanceof Manager) {
            System.out.println("Department: " + ((Manager) employee).getDepartment());
        } else if (employee instanceof Developer) {
            System.out.println("Programming Language: " + ((Developer) employee).getProgrammingLanguage());
        }
    }
    public void increaseSalary(Employee employee, double percentage) {
        double newSalary = employee.getSalary() + (employee.getSalary() * (percentage / 100));
        employee.setSalary(newSalary);
   
    }
}