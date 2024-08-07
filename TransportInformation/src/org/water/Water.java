package org.water;
//child class
import org.water.Water;
import org.transport.Transport;
import org.road.Road;
import org.air.Air;
public class Water {
	private void boat() {
		System.out.println("BlueMoon");
	}
	private void ship() {
		System.out.println("Argus");
	}
	 public static void main(String[] args) {
			//child Class
			Water trans=new Water();
			trans.boat();
			trans.ship();
			//parent Class
			Transport trans1=new Transport();
			trans1.TransportForm();
			//parent Class1
			Road trans2=new Road();
			trans2.bike();
			trans2.cycle();
			trans2.bus();
			trans2.car();
			//parent Class2
			Air trans3=new Air();
			trans3.aeroPlane();
			trans3.heliCopter();
		}
}
