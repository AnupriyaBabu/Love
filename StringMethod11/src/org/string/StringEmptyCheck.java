package org.string;

public class StringEmptyCheck {
	public static void main(String[] args) {
		String input="welcome to java";
		boolean isNotEmpty=!input.isEmpty();
		System.out.println("Input:\""+input+"\"");
		System.out.println("Output:\""+isNotEmpty);
	}
}
