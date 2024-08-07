package org.telgu;
import org.english.English;
public class Telgu extends English {
	private void telgulanguage() {
		System.out.println("Telugu");
	}
	public static void main(String[]args) {
		Telgu multi=new Telgu();
		multi.telgulanguage();
		multi.englishlanguage();
		multi.tamillanguage();
		multi.alllanguage();
	}
}
