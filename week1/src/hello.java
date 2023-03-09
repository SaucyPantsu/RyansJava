import java.util.Scanner;

public class hello {
	public static void main(String[] args) {
		//hello world to confirm code is running
        System.out.println("Hello World!");
        //setting up data input
       int variableA;
       int variableB;
        
        try (Scanner UserA = new Scanner(System.in)) {
			System.out.println("Please enter data");
			//inputting data
			variableA = UserA.nextInt();
			System.out.println("Please enter data");
			variableB = UserA.nextInt();
		}
        //checking data went in
        System.out.println(variableA + variableB);        
    }
}
