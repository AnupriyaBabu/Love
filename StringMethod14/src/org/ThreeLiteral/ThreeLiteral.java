package org.ThreeLiteral;

public class ThreeLiteral {
	public static void main(String[] args) {
		String s1=new String("Nisha");
		String s2=new String("Rengan");
		String s3=new String("NishaRengan");
		int identity_hash_code_s1=System.identityHashCode(s1);
		int identity_hash_code_s2=System.identityHashCode(s2);
		int identity_hash_code_s3=System.identityHashCode(s3);
		System.out.println("s1 address:"+ identity_hash_code_s1);
		System.out.println("s2 address:"+ identity_hash_code_s2);
		System.out.println("s3 address:"+ identity_hash_code_s3);
	}


}
