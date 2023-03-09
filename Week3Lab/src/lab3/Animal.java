package lab3;

/****************************************
* Animal: this is an animal
* Author:Ryan McLoughlin
* Date:2/2/23
*****************************************/

public class Animal {
	
	//attributes
	private String Name;
	private String Breed;
	private boolean domesticAnimal;
	

	//attribute setup
	public Animal(String name)
	{
		this.Name = name;
	}
	
	public Animal(String name, String breed, boolean domestic)
	{
		this.Name = name;
		this.Breed = breed;
		this.domesticAnimal = domestic;
	}
	//setter
	public void setName(String name) {
		this.Name = name;
	}
	public void setBreed(String Breed) {
		this.Breed = Breed;
	}
	public void setDomestic(boolean Domestic) {
		this.domesticAnimal = Domestic;
	}
	//getter
	public String getName() {
		return("Name: "+ Name);
	}
	public String getBreed() {
		return ("Breed: "+ Breed);
	}
	public boolean getDomestic() {
		return domesticAnimal;	
	}
	
	public void makeNoise() {
		if(Breed == "Dog")
		{
			System.out.println("Woof woof");
		}
		
		else if(Breed =="Cat")
		{
			System.out.println("Meow");
		}
		
		else if(Breed =="Mouse")
		{
			System.out.println("Squeak");
		}
	}
	
	//display data
	public String toString() {
		String Data;
		if(Breed != null) {
			Data = "Name: "+Name+"\nBreed: "+Breed;
			if(domesticAnimal ==true) {
				Data = Data + "\nAnimal is Domestic";
			}
			else{
				Data = Data + "\nAnimal is not Domestic";
			}
		}
		else {
			return("Name: "+Name);
		}
		
		return(Data);
	}
}
