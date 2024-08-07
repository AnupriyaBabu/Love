package org.overriding;
//Polymorphism--->method overriding
public class RbiBank extends SbiBank {
	public void savings() {
		System.out.println("Rbi bank provides for 10% savings"); 
	}
	public void deposit() {
		System.out.println("Rbi bank provides for 10% deposit");
	}
	public static void main(String[] args) {
		RbiBank bank=new RbiBank();
		bank.savings();
		bank.deposit();
	}
}
