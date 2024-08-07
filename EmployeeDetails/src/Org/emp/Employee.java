
package Org.emp;
public class Employee {
private void empId() {
	System.out.println("01");
}
private void empName() {
	System.out.println("Geetha");
}
private void empDob() {
	System.out.println("10/06/98");
}
private void empPhone() {
	System.out.println("9876543210");
}
private void empEmail() {
	System.out.println("kavi08@gmail.com");
}
private void empAddress() {
	System.out.println("Trichy");
}
public static void main(String[] args) {
	//ClassName objectName=new ClassName();
	Employee Program=new Employee();
	Program.empId();
	Program.empName();
	Program.empDob();
	Program.empPhone();
	Program.empEmail();
	Program.empAddress();
}
}