package org.computer;
//child class
public class Desktop implements HardWare,SoftWare {
  public void desktopModel() {
	  System.out.println("Dell");
  }
  public void hardWareResources() { 
	  System.out.println("I/O Port Address");
  }
  public void softWareResources() {
	  System.out.println("Types Of SoftWare");
  }
  public static void main(String[] args) {
	  Desktop comp=new Desktop();
	  comp.desktopModel();
	  comp.hardWareResources();
	  comp.softWareResources();
}
}



