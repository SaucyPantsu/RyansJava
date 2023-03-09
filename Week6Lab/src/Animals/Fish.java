package Animals;

public class Fish extends Animal implements Pet{
	//variables
	public String Name;
	//constructor
	public Fish() {
		super(0);
		this.Name = "";
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
		System.out.println("Fish: I am Playing");
	}

	@Override
	//eating method
	public void eat() {
		System.out.println("Fish: I am eating");
	}
	
	@Override
	//walking method
	public void walk() {
		System.out.println("Fish: I have no legs and cannot walk");
	}
	
	
}
