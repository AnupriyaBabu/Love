package org.bank;
import org.bank.BankInfo;
public class AxisBank extends BankInfo  {
	private void deposit() {
		System.out.println("40000");	
	}
	public static void main(String[] args) {
		 AxisBank inherit=new AxisBank();
		inherit.deposit();
		inherit.saving();
		inherit.fixed();	
	}
}
