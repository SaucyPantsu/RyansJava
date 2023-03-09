import java.util.*;

public class Week2 {
	String UserInput;
	static void ConfidenceBoost() {
		System.out.println("Confidence Boost Version 69.42.0");
		int a = DataRead();
		myFunction(a);
	}
	static void myFunction(int size) {
		for(int i = 0; i< size; i++)
		{
		 System.out.println("Hey, Nice cock! ;P");
		}
	}
	static int DataRead() {
		int a = 0;
		try (Scanner reader = new Scanner(System.in)) {
			System.out.println("Please input size");
			a = reader.nextInt();
			return a;
		}	
	}
	static void ReadString() {
		String UserInput = "";
			try (Scanner reader2 = new Scanner(System.in)) {
				System.out.println("Please Give your thoughts on this program: ");
				UserInput = reader2.nextLine();
			}
		System.out.println("Program end");
		System.out.println(UserInput);	
	}
}
