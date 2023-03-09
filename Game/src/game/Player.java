package game;

public class Player {
	private String PlayerName;
	private int AttackDmg;
	private int playerHealth;
	private int[] coords;
	
	public Player(String name, int Damage, int Health) {
		this.PlayerName = name;
		this.AttackDmg = Damage;
		this.playerHealth = Health;
	}

	public void setInjury(int DamageTaken){
		this.playerHealth = this.playerHealth - DamageTaken;
	}
	
	public int dealDamage(){
		System.out.println(this.PlayerName + " has dealt " + this.AttackDmg + " damage");
		return this.AttackDmg;
	}
	
	public int getHealth() {
		return(playerHealth);
	}
	public void setHealth() {
		this.playerHealth = 100;
	}
	
	public int[] getPosition() {
		return(coords);
	}

}
