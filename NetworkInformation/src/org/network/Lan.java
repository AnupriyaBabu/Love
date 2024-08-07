package org.network;
//child class
import org.network.Lan;
import org.network.Wifi;
import org.network.MobileData;
import org.network.Wireless;
public class Lan {
	private void lanName() {
		System.out.println("BSNL");
		}
	public static void main(String[] args) {
	//child Class
			Lan network=new Lan();
			network.lanName();
			//parent Class1
			Wifi network1=new Wifi();
			network1.wifiName();
			//parent Class2
			MobileData network2=new MobileData();
			network2.dataName();
			//parent Class3
			Wireless network3=new Wireless();
			network3.modamName();
}
}
