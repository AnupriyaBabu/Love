package org.nature;
// control Statement--->switch case
public class Air {
public static void main(String[]args) {
	String name="Air";
	switch(name) {
	case "Flowers":{
		System.out.println("Flowers");
		break;
	}
	case "Trees":{
		System.out.println("Trees");
		break;
	}
	case "Animals":{
		System.out.println("Animals");
		break;
	}
	case "Nature":{
		System.out.println("Nature");
		break;
	}
	default: {
		System.out.println("Does Not Match Anything");	
	}
	}
}
}
