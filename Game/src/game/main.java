package game;
public class main {
		
		public static void main(String[] args){
			String Name1 = readString.UserRead(0);
			int gamestate = 0;
			
			System.out.println("GameTest");
			
			Player player = new Player(Name1, 50,100);
			entity enemy = new entity(10, 100);
			while(gamestate == 0) {
					System.out.println("Option 1: Combat\nOption 2: Heal Party");
					int menuOption = menuChoice.UserRead(0);
					switch(menuOption) {
						case 1:
							System.out.println("Combat");
							if(enemy.getHealth()>0) {
								if(player.getHealth()<0) {
									System.out.println("Player died");
									break;
								}
								if(dataRead.UserRead(0) == 1) {
									enemy.setInjury(player.dealDamage());
									System.out.println("Enemy health "+enemy.getHealth());
									System.out.println("Enemy attacked!");
									player.setInjury(enemy.dealDamage());
									System.out.println("Player health "+player.getHealth());
								}
							}
							else {
								System.out.println("Enemy Defeated");
							}
							menuOption = 0;
							break;
								
						case 2: 
							System.out.println("Heal Party");
							player.setHealth();
							System.out.println("Player health "+player.getHealth());
							menuOption = 0;
							break;
							
						default:
							System.out.println("Option 1: Combat\n Option 2: Heal Party");
							menuOption = dataRead.UserRead(0);
							break;
					}
			
	}
}
}
