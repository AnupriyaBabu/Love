package org.overloading;
//same class--->method calling keyword--->this
public class Employee {
		private void empName() {
			System.out.println("Employee Name is Kavi");
			this.empPhno();
		}
		private void empPhno() {
			System.out.println("Employee Phno is 1234567890");
			this.empId();
		}
		private void empId() {
			System.out.println("Employee id is 1234");
			this.empAddress();
		}
		private void empAddress() {
			System.out.println("Employee address is Chennai");
		}
		public static void main(String[] args) {
			Employee emp=new Employee();
			emp.empName();
		}

}
