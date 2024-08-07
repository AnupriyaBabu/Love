package org.SubString;

public class SubString {
	public static void main(String[] args) {
		String input="Welcome to java Class";
		String substring=getsubstring(input);
		System.out.println("Input:"+input);
		System.out.println("Output:"+substring);
		
	}

	private static String getsubstring(String input) {
		int index=input.indexOf(' ');
		if(index !=-1) {
		return input.substring(0,index);
		}
		else {
		return input;
	}
}
}
