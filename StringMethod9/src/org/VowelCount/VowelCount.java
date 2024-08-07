 package org.VowelCount;

public class VowelCount {
	public static void main(String[] args) {
		String input="Welcome";
		int VowelsCount=countVowels(input);
		System.out.println("Input:"+input);
		System.out.println("VowelsCount:"+VowelsCount);
		
	}

	private static int countVowels(String input) {
		int count=0;
		for(int i=0;i<input.length();i++) {
			char ch=Character.toLowerCase(input.charAt(i));
			{
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') count++;	
}
}
		return count;
}
}
