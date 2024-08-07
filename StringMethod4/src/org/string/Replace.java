package org.string;

public class Replace {
	public static void main(String[] args) {
		String s="Wellcome to Java Class";
		String replace=s.replace("Wellcome to Java Class","Wellcome#to#Java#Class");
		System.out.println(replace);
		
		String s1="Nishakerala24@gmail.com";
		String replace1=s1.replace("Nishakerala24@gmail.com","Nishakerala24@yahoo.com");
		System.out.println(replace1);
		
		String s2="5-35-2a,venkatesh nivas,Aruppukottai,pincode-626101";
		String replace2=s2.replace("5-35-2a,venkatesh nivas,Aruppukottai,pincode-626101",
				"5-35-2a,venkatesh nivas,Aruppukottai");
		System.out.println(replace2);
}
	}
	

