package org.student;

import java.util.Scanner;

public class Student {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Student ID:");
		int StudentId=scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter Student Name:");
		String StudentName=scanner.nextLine();
		scanner.nextLine();
		System.out.println("Enter marks for Mark1:");
		int Mark1=scanner.nextInt();
		System.out.println("Enter marks for Mark2:");
		int Mark2=scanner.nextInt();
		System.out.println("Enter marks for Mark3:");
		int Mark3=scanner.nextInt();
		System.out.println("Enter marks for Mark4:");
		int Mark4=scanner.nextInt();
		System.out.println("Enter marks for Mark5:");
		int Mark5=scanner.nextInt();
		int totalMarks=Mark1+Mark2+Mark3+Mark4+Mark5;
		double averageMarks=totalMarks/5.0;
		System.out.println("Total marks:"+totalMarks);
		System.out.println("Average marks:"+averageMarks);
		scanner.close();	
	}

}
