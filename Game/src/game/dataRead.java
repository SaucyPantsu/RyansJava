package game;
import java.util.Scanner;

public class dataRead {

	public static int UserRead(int GameOver) {
		int UserChoice = 0;
			Scanner reader = new Scanner(System.in);
			System.out.println("1: Attack\n");
				UserChoice = reader.nextInt();
			System.out.println("Attack!");
			
			if(GameOver ==1)
			{
				reader.close();
			}
			return UserChoice;
			
	}
}
