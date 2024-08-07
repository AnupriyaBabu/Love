package org.phone;
public class Phone {
	public void phoneInfo() {
		System.out.println("InternalStorage");
	}
	public static void main(String[] args) {
		Phone datatype=new Phone();
		datatype.phoneInfo();
		byte speed= 26;
		System.out.println("Phone  speed is"+speed);
		short model = 1234;
		System.out.println("Phone model is"+model);
		int imei = 22244556;
		System.out.println("Phone imei is"+imei);
		long phNo =9876541230l;
		System.out.println("Phone phNo is"+phNo);
		float gB =2.4867458f;
		System.out.println("Phone gB is"+gB);
		double mB=2.2564795535879d;
		System.out.println("Phone mB is"+mB);
		char a='M';
		System.out.println("Phone a is"+a);
		String name ="Redmi";
		System.out.println("Phone name is"+name);
		boolean isworking = false;
		System.out.println("Phone is Working..?"+isworking);	
}
}
