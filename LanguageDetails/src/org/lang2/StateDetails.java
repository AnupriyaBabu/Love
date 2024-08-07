package org.lang2;
//child Class
		import org.lang.LanguageInfo;
public class StateDetails {
	
			private void southIndia() {
				System.out.println("Tamil");
			}
			private void northIndia() {
				System.out.println("English");
			}
			public static void main(String[] args) {
				//child Class
				StateDetails lang2=new StateDetails();
				lang2.southIndia();
				lang2.northIndia();
				
				//parent Class
				LanguageInfo lang=new LanguageInfo();
				lang.tamilLanguage();
				lang.englishLanguage();
				lang.hindiLanguage();	
			}
		}



