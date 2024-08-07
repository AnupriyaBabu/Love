package org.fourWheeler;
//child class
import org.fourWheeler.FourWheeler;
import org.allvehicle.Vehicle;
import org.twoWheeler.TwoWheller;
import org.threeWheeler.ThreeWheeler;
public class FourWheeler {
	private void car() {
		System.out.println("Hyundai");
	}
	private void bus() {
		System.out.println("SETC");
	}
	private void lorry() {
		System.out.println("Truck");
	}
    public static void main(String[] args) {
	//child Class
	FourWheeler Vehicle=new FourWheeler();
	Vehicle.car();
	Vehicle.bus();
	Vehicle.lorry();
	//parent Class
	Vehicle Vehicle1=new Vehicle();
	Vehicle1.VehicleNecessery();
	//parent Class1
	TwoWheller Vehicle2=new TwoWheller();
	Vehicle2.bike();
	Vehicle2.cycle();
	//parent Class2
	ThreeWheeler Vehicle3=new ThreeWheeler();
	Vehicle3.Auto();
}
    }
