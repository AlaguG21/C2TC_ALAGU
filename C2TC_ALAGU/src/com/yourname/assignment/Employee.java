package com.yourname.assignment;

public class Employee {
 
		// TODO Auto-generated method stub
		    private String name;
		    private int employeeId;
		    private double salary;

		    // Constructor
		    public Employee(String name, int employeeId, double salary) {
		        this.name = name;
		        this.employeeId = employeeId;
		        this.salary = salary;
		    }

		    // Getter and Setter methods
		    public String getName() {
		        return name;
		    }

		    public void setName(String name) {
		        this.name = name;
		    }

		    public int getEmployeeId() {
		        return employeeId;
		    }

		    public void setEmployeeId(int employeeId) {
		        this.employeeId = employeeId;
		    }

		    public double getSalary() {
		        return salary;
		    }

		    public void setSalary(double salary) {
		        this.salary = salary;
		    }
		}
