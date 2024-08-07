package org.client;
import org.company.Company;
public class Client extends Company {
		private void clientName() {
			System.out.println("Ram");
		}
		public static void main(String[]args) {
			Client inherit=new Client();
			inherit.clientName();
			inherit.companyName();
		}
}
