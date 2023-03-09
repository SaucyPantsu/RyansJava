package Animals;

public class Spider extends Animal {

	//constructor
	protected Spider() {
		super(8);
	}
	
	//implementing eat
	@Override
	public void eat() {
		System.out.println("I am eating");
	}

}
