package project3.characters;

public class Monster extends Entity{
	// Constructors
	public Monster() {
		health = 10;
		damage = 3;
	}
	
	Monster(int health, int damage) {
		super(health, damage);
	}
	
	// Monster specific Methods
	public void attackUp() {
		damage++;
	}
}
