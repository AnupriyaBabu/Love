
package org.Company;
public class CompanyInfo {
private void companyName() {
	System.out.println("Acer");
}
private void companyId() {
	System.out.println("05");
}
private void companyAddress() {
	System.out.println("Mumbai");
}
public static void main(String[] args) {
	//ClassName objectName=new ClassName();
		CompanyInfo Program=new CompanyInfo();
	Program.companyName();
	Program.companyId();
	Program.companyAddress();
}
}