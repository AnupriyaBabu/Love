package org.bank;
public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("100 Lakhs"); 
	}
	public static void main(String[] args) {
		AxisBank bank=new AxisBank();
		bank.savings();
		bank.fixed();
		bank.deposit();
	}
}
