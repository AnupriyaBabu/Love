package org.lang;
import org.lang.LanguageInfo;
public class StateDetails extends LanguageInfo {
	private void southIndia() {
		System.out.println("Tamil");	
	}
	private void northIndia() {
		System.out.println("English");
	}
	public static void main(String[] args) {
		StateDetails inherit=new StateDetails();
		inherit.southIndia();
		inherit.northIndia();
		inherit.tamilLanguage();
		inherit.englishLanguage();
		inherit.hindiLanguage();	
	}
}
