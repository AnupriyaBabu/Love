package org.add;
public class GreensTech {
	//one method one argument
	private void greensOmr(int id) {
		System.out.println("Greens id is"+id);
	}
	//one method more than one arguments
	private void greensOmr(int age,long acNo,String name) {
		System.out.println(" Greens student age is"+age+"\n"+"Greens acNo is"+acNo+"\n"+"Greens student name is"+name);
	}
	//more than one arguments but order change
	private void greensOmr(long aadhar,int phNo,String branchName) {
		System.out.println("Greens studentaadhar is"+aadhar+"\n"+"Greens phNo is"+phNo+"\n"+"Greens branchName is"+branchName);
	}
	public static void main(String[] args) {
		GreensTech add=new GreensTech();
		add.greensOmr(1234);
		add.greensOmr(26, 245879634587l,"Lakshmi");
		add.greensOmr(245687123568l,1234567890, "Chennai-600028");
	}
}
