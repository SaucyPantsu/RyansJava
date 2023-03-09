package com.lab2.test;
/****************************************
* Control: This class controls things in main
* Author: Ryan McLoughlin
* Date:2/2/23
*****************************************/


public class control {

	public static void main(String[] args){
		 	System.out.println("Hello World");
		 
			 vehicle myCar = new vehicle("Employee1", 421);
			 vehicle myOtherCar = new vehicle("Employee1", 8473, "Manual", "Blue", 2004, 120, 4);
			 vehicle Employee1sCar = new vehicle("Ryan",8472,"Manual","Red",2022,180,4);
			System.out.println(myOtherCar);
			System.out.println(myCar);
			System.out.println(myOtherCar.toString());
			System.out.println(myCar.toString());
			System.out.println(Employee1sCar.toString());
			System.out.println(myOtherCar.toString2());
			System.out.println(myCar.toString2());
			System.out.println(Employee1sCar.toString2());
		}
}
