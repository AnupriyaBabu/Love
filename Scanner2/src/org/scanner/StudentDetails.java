package org.scanner;

import java.util.Scanner;

public class StudentDetails {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Student ID:");
		int studentId=scanner.nextInt();
		System.out.println("Student ID:"+studentId);
		scanner.nextLine();
		System.out.println("Enter Student Name:");
		String studentName=scanner.nextLine();
		System.out.println("Student Name:"+studentName);
		scanner.nextLine();
		System.out.println("Enter Student Email:");
		String studentEmail=scanner.nextLine();
		System.out.println("Student Email:"+studentEmail);
		scanner.nextLine();
		System.out.println("Enter Student Phone Number:");
		String studentPhoneNo=scanner.nextLine();
		System.out.println("Student Phone Number:"+studentPhoneNo);
		scanner.nextLine();
		System.out.println("Enter Student Department:");
		String studentDept=scanner.nextLine();
		System.out.println("Student Department:"+studentDept); 
		scanner.nextLine();
		System.out.println("Enter Student Gender:");
		String studentGender=scanner.nextLine();
		System.out.println("Student Gender:"+studentGender);
		scanner.nextLine();
		System.out.println("Enter Student City:");
		String studentCity=scanner.nextLine();
		System.out.println("Student City:"+studentCity);
		scanner.nextLine();	
		scanner.close();
		
	}

}
