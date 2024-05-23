package project3.characters;

public class Berserker extends Entity{

	// Constructors
	public Berserker() {
		health = 15;
		damage = 2;
	}
	
	Berserker(int health, int damage) {
		super(health, damage);
	}
	
	// Berserker specific methods
	public void attackUp() {
		damage++;
	}
}
