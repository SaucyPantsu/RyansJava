package Animals;

public class Cat extends Animal implements Pet{
	
	//Constructor
	
	public String Name;
	
	public Cat() {
		this("");
	}
	public Cat(String Name) {
		super(4);
		this.Name = Name;
	}

	@Override
	//name getter
	public String getName() {
		return("I am"+this.Name);
	}

	@Override
	//name setter
	public void setName(String Name) {
		this.Name = Name;
	}

	@Override
	//play method
	public void play() {
		System.out.println("Cat: I am Playing");
	}

	@Override
	//eating method
	public void eat() {
		System.out.println("Cat: I am eating");
	}

}
