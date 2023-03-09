import java.util.Scanner;

/*
 * 	Ryan McLoughlin C21431604
 * 	26/1/23
 * 	This is an averaging program
 */
public class average {
	public static void main(String[] args) {
		//declaring variables
		int a,b,c;
		float average;
		//scanning inputs
		try (Scanner reader = new Scanner(System.in)) {
			System.out.println("Please enter data");
			a = reader.nextInt();
			b = reader.nextInt();
			c = reader.nextInt();
		}
		//calculate average
		average = (a+b+c)/3;
		//print average
		System.out.println("The Average is "+average);
	}
}
