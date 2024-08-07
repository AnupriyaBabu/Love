package org.string;

public class Split {
	public static void main(String[] args) {
		String s="Welcome to Java Class";
		String[]words=s.split(" ");
		for(String word:words) {
		System.out.println(word);
	}
}
}
