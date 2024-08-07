package org.edu;
public class Arts extends Education {
	public void bsc() {
		System.out.println("CS");
	}
	public void bEd() {
		System.out.println("Teacher");
	}
	public void bA() {
		System.out.println("Tamil");
	}
	public void bBA() {
		System.out.println("Administration");
	}
	public void ug() {
		System.out.println("3");
	}
	public void pg() {
		System.out.println("2");
	}
	public static void main(String[] args) {
		Arts edu=new Arts();
		edu.bsc();
		edu.bA();
		edu.bEd();
		edu.bBA();
		edu.pg();
		edu.ug();
	}
}
