package org.student;

import java.util.Scanner;

public class EmployeeDetails {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Employee ID:");
		int empId=scanner.nextInt();
		System.out.println("Employee ID:"+empId);
		scanner.nextLine();
		System.out.println("Enter Employee Name:");
		String empName=scanner.nextLine();
		System.out.println("Employee Name:"+empName);
		scanner.nextLine();
		System.out.println("Enter Employee Email:");
		String empEmail=scanner.nextLine();
		System.out.println("Employee Email:"+empEmail);
		scanner.nextLine();
		System.out.println("Enter Employee PhoneNumber:");
		String empPhoneNo=scanner.nextLine();
		System.out.println("Employee PhoneNo:"+empPhoneNo);
		scanner.nextLine();
		System.out.println("Enter Employee Salary:");
		double empSalary=scanner.nextDouble();
		System.out.println("Employee Salary:"+empSalary); 
		scanner.nextLine();
		System.out.println("Enter Employee Gender:");
		String empGender=scanner.nextLine();
		System.out.println("Employee Gender:"+empGender);
		scanner.nextLine();
		System.out.println("Enter Employee City:");
		String empCity=scanner.nextLine();
		System.out.println("Employee City:"+empCity);
		scanner.nextLine();	
		
	}

}
