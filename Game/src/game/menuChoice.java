package game;

import java.util.Scanner;

public class menuChoice {
		public static int UserRead(int GameOver) {
			int UserChoice = 0;
				Scanner reader = new Scanner(System.in);
					UserChoice = reader.nextInt();
				System.out.println("You have selected " + UserChoice);
				
				if(GameOver ==1)
				{
					reader.close();
				}
				return UserChoice;
			
	}
}

