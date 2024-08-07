package org.edu;
import org.edu.Engineering;
public class Medicine extends Engineering {
	private void physiyo() {
		System.out.println("Excersice");
	}
	private void dental() {
		System.out.println("Teeth");
	}
	private void mbbs() {
		System.out.println("Fever");
	}
	public static void main(String[]args) {
		Medicine multi=new Medicine();
		multi.physiyo();
		multi.dental();
		multi.mbbs();
		multi.bE();
		multi.bTech();
		multi.bsc();
		multi.bEd();
		multi.bA();
		multi.mBA();
		multi.ug();
		multi.pg();
	}
}
