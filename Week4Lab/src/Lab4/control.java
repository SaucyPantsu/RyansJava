package Lab4;

public class control {
	
	public static void main(String[] args){
	 	Employee one = new Employee("John","Doe", 1234, 7598.58423);
	 	HourlyEmployee two = new HourlyEmployee("Employee1", "Mundane", 4321, 50, 11.50);
	 	SalesEmployee three = new SalesEmployee("Will", "Moore", 69420, 800000, 8000);
	 	
	 	System.out.println(one.toString());
	 	System.out.println(two.toString());
	 	System.out.println(three.toString());
	}

}
