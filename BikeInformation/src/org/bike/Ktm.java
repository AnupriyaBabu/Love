package org.bike;

public class Ktm implements Bike {
	public void cost() {
		System.out.println("80000");
	}
	public void speed() {
		System.out.println("450"); 
	}
	public static void main(String[] args) {
		Ktm bike=new Ktm();
		bike.cost();
		bike.speed();
	}

}
