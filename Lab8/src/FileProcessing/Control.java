package FileProcessing;

import java.io.*;

public class Control {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Job Test = new Job(1, "lawyer", 1);
		Job Test2 = new Job(1, "Doctor", 1);
		
		Person Ben = new Person("Ben", "Benl", 1, 2, 1234, "male");
		
		Employee One = new Employee("John", "Snow", 1, 5, 9773, "Male", Test, 4, 8, 54, 10, 1);
		Employee Two = new Employee("John", "Will", 1, 5, 9773, "Male", Test2, 4, 8, 54, 10, 1);
		
		System.out.println(One.toString());
		System.out.println(Two.toString());
		System.out.println(Ben.toString());
		
		
	}

}
