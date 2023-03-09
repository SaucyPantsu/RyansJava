package Animals;

public class TestAnimals {
	public static void main(String[] args){
			//making objects
			Fish d = new Fish();
			Cat c = new Cat("Fluffy");
			Animal a = new Fish();
			Animal e = new Spider();
			Pet p = new Cat();	
			
			//running methods
			
			//fish
			System.out.println("Fish D");
			d.setName("Spot The Fish");
			d.getName();
			d.eat();
			d.play();
			d.walk();
			
			//cat
			System.out.println("Cat C");
			c.getName();
			c.play();
			c.eat();
			c.walk();
			
			//fish
			System.out.println("Fish A");
			a.eat();
			a.walk();
			
			//spider
			System.out.println("Spider E");
			e.eat();
			e.walk();
			
			//pet 
			System.out.println("Cat Pet P");
			p.setName("Kitty");
			p.getName();
			p.play();
		}
}
