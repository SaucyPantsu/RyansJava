package com.lab2.test;

/****************************************
* Vehicle: This class is a vehicle
* Author:Ryan McLoughlin
* Date:2/2/23
*****************************************/
public class vehicle {
		String Owner;
		int Registration;
		double MaxSpeed;
		String Colour;
		String TransmissionType;
		int WheelAmount;    
		String Model;
		int Year;
		boolean recentCar;
		
		public vehicle(String Owner, int Registration)
		{
			this.Owner = Owner;
			this.Registration = Registration;	
		}
		public vehicle(String Owner, int Registration, String TransmissionType, String Colour)
		{
			this.Owner = Owner;
			this.Registration = Registration;	
			this.TransmissionType = TransmissionType;
			this.Colour = Colour;
		}
		public vehicle(String Owner, int Registration, String TransmissionType, String Colour, int Year, double MaxSpeed)
		{
			this.Owner = Owner;
			this.Registration = Registration;	
			this.TransmissionType = TransmissionType;
			this.Colour = Colour;
			this.Year = Year;
			this.MaxSpeed = MaxSpeed;
			if(Year <= 2002)
			{
				recentCar = false;
			}
			else
			{
				recentCar = true;
			}
		}
		public vehicle(String Owner, int Registration, String TransmissionType, String Colour, int Year, double MaxSpeed, int WheelAmount)
		{
			this.Owner = Owner;
			this.Registration = Registration;	
			this.TransmissionType = TransmissionType;
			this.Colour = Colour;
			this.Year = Year;
			this.MaxSpeed = MaxSpeed;
			this.WheelAmount = WheelAmount;
			if(Year <= 2002)
			{
				recentCar = false;
			}
			else
			{
				recentCar = true;
			}
		}
		
		public String toString() {	
			return ("Model:"+Model+"\nOwner:"+Owner+"\nRegistration:"+Registration+"\nMax Speed:"+MaxSpeed+"\nColour:"+Colour+"\nTransmission:"+TransmissionType+"\nWheels:"+WheelAmount+"\nYear:"+Year);
		}
		
		public String toString2() {
			return("\nRecent car: "+recentCar);
		}
		
	}

