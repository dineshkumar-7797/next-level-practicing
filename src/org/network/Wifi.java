package org.network;
/*QUESTION 11:
--------------
     Project   :NetworkInformation
     Package   :org.network
     Class     :Wifi
     Methods   :wifiName()

     Class     :MobileData
     Methods   :dataName()

     Class     :Lan
     Methods   :lanName()

     Class     :Wireless
     Methods   :modamName()

Description:
Create an object for all 4 classes  inside the Wifi class and call all 
classes methods also follow the all coding standards.*/
public class Wifi {
	String WifiName="Free Wifi";
	 
public void wifiName() {
	System.out.println("Wifi Name :"+WifiName);
	}
public static void main (String[] args) {
	Wifi wifi =new Wifi();
	wifi.wifiName();
	MobileData MD=new MobileData();
	MD.dataName();
	Lan l=new Lan();
	l.lanName();
	Wireless w=new Wireless();
	w.modemName();


}
}
