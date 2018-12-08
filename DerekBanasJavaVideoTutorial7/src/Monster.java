// You cannot create more than one public class!
public class Monster {
	
	public final String TOMBSTONE = "Here Lies a Dead Monster!"; // constant since it's "final" - meaning the value cannot be changed!
	
	
	// Fields or Class Variables or Instance Variables
	private int health = 500;
	private int attack = 25;
	private int movement = 2;
	private int position = 0;
	private boolean alive = true;
	
	public String name = "Big Monster";
	
	// Access methods
	public int getAttack()
	{
		return attack;
	}
	
	public int getMovement()
	{
		return movement;
	}
	
	public int getHealth()
	{
		return health;
	}
	
	public void setHealth(int decreaseHealth) 
	{
		health = health - decreaseHealth;
		if (health < 0)
		{
			alive = false;
		}
	}
	
	public void setHealth(double decreaseHealth)
	{	
		// convert from a double to an int
		int intDecreaseHealth = (int) decreaseHealth;
		health = health - intDecreaseHealth;
		if (health < 0)
		{
			alive = false;
		}
	}
	
	// constructor - cannot have ANY return type (void, int, String, double, etc.)
	public Monster(int health,int attack, int movement, int position) {
		this.health = health; // "this" refers to the class instance variables
		this.attack = attack;
		this.movement = movement;
		this.position = position;
	}
	
	
	
	// Overloading Constructors
	public Monster()
	{
		
	}
	
	public Monster(int newHealth)
	{
		health = newHealth;
	}
	
	public Monster(int newHealth, int newAttack)
	{
		health = newHealth;
		attack = newAttack;
	}
	
	public static void main(String[] args) 
	{		
		Monster Frank = new Monster();
		
		Frank.setHealth(100);
		
		System.out.println(Frank.attack);
		System.out.println(Frank.health);
		
		
	}
	
	
}



	