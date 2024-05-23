package project3.characters;

public class Knight extends Entity{
	// Constructor
	public Knight() {
		health = 20;
		damage = 2;
	}
	
	Knight(int health, int damage) {
		super(health, damage);
	}
	
	// Knight Specific methods
	public void heal() {
		health += 2;
	}
}
