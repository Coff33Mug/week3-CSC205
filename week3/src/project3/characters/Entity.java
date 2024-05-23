package project3.characters;

	public abstract class Entity {
		// Inherent entity values
	protected int health;
	protected int damage;
	
	// Constructors
	Entity() {
	}
	
	Entity(int Health, int Damage) {
		this.health = Health;
		this.damage = Damage;
	}
	
	// Prints health and damage 
	public String toString() {
		return "Heatlh: " + health + "\nDamage: " + damage;
	}
	
	// Checks entity health
	public boolean isAlive() {
		if (health > 0) {
			return true;
		}
		return false;
	}
	
	// Modifies and returns entity health
	public int hit(int damage) {
		return health - damage;
	}
	
	// Get methods
	public int getH() {
		return health;
	}
	
	public int attack() {
		return damage;
	}
	
	// Set Methods
	public void setH(int health) {
		this.health = health;
	}

	public void setD(int damage) {
		this.damage = damage;
	}
}
