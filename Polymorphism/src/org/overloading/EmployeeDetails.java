package org.overloading;
//Polymorphism....>method overloading
//same class->EmployeeDetails
public class EmployeeDetails {
	//same method name-->employee
	//one method one argument
	private void employee(int age) {
		System.out.println("Employee Age is"+age);
	}
	//one method more than one arguments
	private void employee(int id,long acNo,String name) {
		System.out.println("Employee id is"+id+"\n"+"Employee acNo is"+acNo+"\n"+"Employee name is"+name);
	}
	//more than one arguments but order change
	private void employee(long aadhar,int phNo,String address) {
		System.out.println("Employee aadhar is"+aadhar+"\n"+"Employee phNo is"+phNo+"\n"+"Employee address is"+address);
	}
	public static void main(String[] args) {
		EmployeeDetails emp=new EmployeeDetails();
		emp.employee(25);
		emp.employee(1234, 245879634587l,"Roja");
		emp.employee(245687123568l,1234567890, "Chennai-600028");
	}
}
