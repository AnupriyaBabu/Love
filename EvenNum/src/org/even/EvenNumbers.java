package org.even;

public class EvenNumbers {
	public static void main(String[] args) {
		int n=100;
		System.out.println("Even Numbers from 1 to 100");
		for(int i=1;i<=n;i++)
		{
			if(i%2==0) 
			{
				System.out.println(i+"");
			}
		}
	}

}
