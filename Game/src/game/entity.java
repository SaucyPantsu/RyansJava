package game;

public class entity {
	
	private int damage;
	private int health;
	
	public entity(int BaseD, int BaseH) {
		this.damage = BaseD;
		this.health = BaseH;
	}
	public void setInjury(int DamageTaken){
		this.health = this.health - DamageTaken;
	}
	
	public int dealDamage(){
		return this.damage;
	}
	public int getHealth() {
		return(health);
	}
}
