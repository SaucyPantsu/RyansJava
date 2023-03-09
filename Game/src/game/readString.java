package game;

import java.util.Scanner;

public class readString {
	public static String UserRead(int GameOver) {
		String UserChoice = "";
			Scanner reader = new Scanner(System.in);
			System.out.println("What are you naming this character?");
				UserChoice = reader.nextLine();
			
			if(GameOver ==1)
			{
				reader.close();
			}
			return UserChoice;
			
	}
}