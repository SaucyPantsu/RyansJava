package lab3;
/****************************************
* Main:This is where i initialise animals
* Author:Ryan McLoughlin
* Date:2/2/23
*****************************************/
public class Control {

	public static void main(String[] args){
	 	System.out.println("Hello World");
	 	
	 	Animal SpotDog = new Animal("Spot","Labrador",true);
	 	Animal Leo = new Animal("Leo");
	 	Animal Lucien = new Animal("Lucien","Brison Frise",true);
	 	Animal Mouse = new Animal("Jerry","Mouse",false);
	 	
	 	System.out.println(SpotDog);
	 	System.out.println(Leo);
	 	System.out.println(Lucien);
	 	
	 	/*
	 	System.out.println(SpotDog.domesticAnimal);
	 	System.out.println(Leo.Name);
	 	System.out.println(Lucien.Breed);
	 	*/
	 	
	 	Lucien.setBreed("Dog");
	 	SpotDog.setBreed("Dog");
	 	Leo.setDomestic(true);
	 	
	 	System.out.println(Lucien.getName());
	 	System.out.println(Lucien.getBreed());
	 	
	 	System.out.println(SpotDog.getName());
	 	System.out.println(SpotDog.getBreed());
	 	
	 	Mouse.makeNoise();
	 	Lucien.makeNoise();
	 	SpotDog.makeNoise();
	}
}
