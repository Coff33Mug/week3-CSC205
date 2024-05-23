package project3.characters;

public class Rouge extends Entity{
	// Constructors
	public Rouge() {
		health = 12; 
		damage = 4;
	}
	
	public Rouge(int health, int damage) {
		super(health, damage);
	}
	
	// Rouge Specific Methods
	public int daggerThrow() {
		return ((int)Math.random() * 5) + 1;
	}
}
