package com.yash.OopsAssignment.Question1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

	public static void main(String[] args) throws ParseException {
		Department[] deptDepartments = new Department[2];
		deptDepartments[0] = new Department("Dept101", "Hr Department");
		deptDepartments[1] = new Department("Dept201", "It Department");

		String birthDate = "20/10/1990";
		Date dob = new SimpleDateFormat("dd/MM/yyyy").parse(birthDate);

		String joinDate = "23/5/2022";
		Date doj = new SimpleDateFormat("dd/MM/yyyy").parse(joinDate);

		String regDate = "23/12/2022";
		Date dor = new SimpleDateFormat("dd/MM/yyyy").parse(regDate);

		Employee emp = new Employee(1, "smita", "magarpatta", dob, 100000.00, doj, "Pune", deptDepartments[1], 78945,
				"smita.adhav@yash.com");

		Customer customer = new Customer(101, "smita", "magarpatta", dob, dor, "Pune", 11450, "smita.adhav@yash.com");

		System.out.println("Employee Details");
		emp.printEmployeeDetails();
		
		System.out.println("\ncustomer Details");
		customer.printCustomerDetails();
		
		
	}



}
