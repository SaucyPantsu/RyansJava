package Animals;

abstract class Animal {
	//variables
	protected int Legs;
	//constructor
	protected Animal(int Legs) {
		this.Legs=Legs;
	}
	//abstract method
	public abstract void eat();
	
	//concrete method
	//walking
	public void walk() {
			System.out.println("I have "+this.Legs+" legs and I can walk");
		}
	
}
