package org.computer;
public class ComputerProgram {
	private void dataType() {
		System.out.println("Data Type");
		//byte(-128 to 127)
		//data type variableName=value;
		byte weight= 65;
		System.out.println("Human Weight"+weight);
		short identity = 6234;
		System.out.println("My Employee Id"+identity);
		System.out.println("My first value"+weight+"\n"+"My second value"+identity);
	}
	private void dataType2() {
		int pincode = 639104;
		System.out.println("My Pincode"+pincode);
		long phoneNumber =9876541230l;
		System.out.println("My phoneNumber"+phoneNumber);
		System.out.println("My pincode"+pincode+"My phoneNumber"+phoneNumber);
	}
	public static void main(String[] args) {
		ComputerProgram a=new ComputerProgram();
		a.dataType();
		a.dataType2();
		float value1 =11.4867458f;
		System.out.println("My float value1"+value1);
		double value2=14.2564795535879d;
		System.out.println("My double value2"+value2);
		char b='G';
		char c='4';
		System.out.println("My char value"+b+c);
		String name ="Love is God";
		System.out.println("My String value"+name);
		boolean f = false;
		System.out.println("My boolean value"+f); 
		System.out.println("My float value1"+value1+"\n"+"My double value2"+value2+"\n"+"My char value"+b+c+"\n"+"My String value"+name+"\n"+"My boolean value"+f);
		System.out.println("My float value1"+value1+"My double value2"+value2+"My char value"+b+c+"My String value"+name+"My boolean value"+f);
	}
}
