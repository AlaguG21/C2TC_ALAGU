package com.yourname.assignment;

public class AssignmentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        // Create instances of Manager and Developer
		        Manager manager = new Manager("Alice", 101, 90000, "IT");
		        Developer developer = new Developer("Bob", 102, 75000, "Java");

		        // Create an instance of EmployeeUtilities
		        com.yourname.assignment.utilities.EmployeeUtilities utilities = new com.yourname.assignment.utilities.EmployeeUtilities();

		        // Display details of employees
		        System.out.println("Manager Details:");
		        utilities.displayEmployeeDetails(manager);

		        System.out.println("\nDeveloper Details:");
		        utilities.displayEmployeeDetails(developer);

		        // Increase salary
		        utilities.increaseSalary(manager, 10); // 10% increase
		        utilities.increaseSalary(developer, 15); // 15% increase

		        // Display updated details
		        System.out.println("\nUpdated Manager Details:");
		        utilities.displayEmployeeDetails(manager);

		        System.out.println("\nUpdated Developer Details:");
		        utilities.displayEmployeeDetails(developer);
		 

	}

}
