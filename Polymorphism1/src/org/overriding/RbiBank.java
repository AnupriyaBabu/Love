package org.overriding;
//different class-->method calling keyword--->super
public class RbiBank extends SbiBank {
	public void savings() {
		System.out.println("Rbi bank provides for 10% savings"); 
		super.savings();
	}
	public void deposit() {
		System.out.println("Rbi bank provides for 10% deposit");
		super.deposit();
	}
	public static void main(String[] args) {
		RbiBank bank=new RbiBank();
		bank.savings();
		bank.deposit();
	}

}
