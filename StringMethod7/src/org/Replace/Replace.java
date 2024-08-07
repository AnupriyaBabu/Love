package org.Replace;

public class Replace {
	public static void main(String[] args) {
		String input="Welcome";
		String output=replacevowels(input);
		System.out.println("Input:"+input);
		System.out.println("Output:"+output);
	}

	private static String replacevowels(String input) {
		return
		input.replaceAll("Welcome","W@lc@m@");
		
	}
}
