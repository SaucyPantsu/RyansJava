package game;

public class combat {
	
	
public combat() {
	Player player = new Player(Name1, 50,100);
	entity enemy = new entity(10, 100);
	
	while(enemy.getHealth()>0) {
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
}
