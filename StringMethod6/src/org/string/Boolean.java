package org.string;

public class Boolean {
	public static void main(String[] args) {
		String s="Welcome to Java Class";
		
		boolean startswith=s.startsWith("Welcome");
		System.out.println(startswith);
		
		boolean endswith=s.endsWith("java");
		System.out.println(endswith);
		
		boolean endswith1=s.endsWith("Class");
		System.out.println(endswith1);
		
		boolean empty=s.isEmpty();
		System.out.println(empty);
		
		
		String s1="";
		boolean empty1=s.isEmpty();
		System.out.println(empty1);
		
		String s2="Hai i am nisha";
		boolean startswith1=s.startsWith("Welcome");
		System.out.println(startswith1);		
}
}
