package org.univ;

public class College extends University {
	public void ug() {
		System.out.println("BSC");
	}
	public void pg() {
		System.out.println("MSC");
	}
	public static void main(String[] args) {
		College univ=new College();
		univ.ug();
		univ.pg();
	}
}
