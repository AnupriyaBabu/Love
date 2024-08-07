package org.phone;
//child Class
import org.phone.ExternalStorage;
public class InternalStorage {
	private void processorName() {
		System.out.println("Sitha");
		}
	private void ramSize() {
		System.out.println("16");
		}
		public static void main(String[] args) {
			//child Class
			InternalStorage sales=new InternalStorage();
			sales.processorName();
			sales.ramSize();
			//parent Class
			ExternalStorage sales1=new ExternalStorage();
			sales1.size();

}
}
