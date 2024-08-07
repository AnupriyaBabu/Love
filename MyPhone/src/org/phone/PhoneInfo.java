
package org.phone;
public class PhoneInfo {
private void PhoneName() {
	System.out.println("OnePlus");
}
private void PhoneMieiNum() {
	System.out.println("357503040704274");
}
private void Camera() {
	System.out.println("50mpsony");
}
private void Storage() {
	System.out.println("256GB");
}
private void OsName() {
	System.out.println("pinyinyang");
}
public static void main(String[] args) {
	//ClassName objectName=new ClassName();
	PhoneInfo Program=new PhoneInfo();
	Program.PhoneName();
	Program.PhoneMieiNum();
	Program.Camera();
	Program.Storage();
	Program.OsName();
}
}