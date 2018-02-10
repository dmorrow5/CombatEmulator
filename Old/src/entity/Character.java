package entity;

import utilities.Skill;
import java.util.ArrayList;

public abstract class Character {
	
	//------------------Variables-------------------------
	protected String name;
	protected double attack;
	protected double health;
	
	protected int level;
	
	protected ArrayList<Skill> abilities = null;
	
	
	//------------------Constructors-----------------------
	
	/**
	 * Primary Constructor
	 * @param newAttack Sets characters initial attack
	 * @param newHealth Sets 
	 */
	public Character (String newName, double newAttack, double newHealth, int newLevel)
	{
		this.name = newName;
		this.attack = newAttack;
		this.health = newHealth;
		this.level = newLevel;
	}
	
	
	//----------------Other Methods---------------------------
	
	
	
	/**
	 * 
	 * @return True if health is above 0
	 */
	public boolean isAlive()
	{
		if (health > 0)
			return true;
		else
			return false;
	}
	
	/**
	 * 
	 * @return Characters Damage
	 */
	public double attackDamage()
	{
		return attack;
	}
	
	/**
	 * 
	 * @param damageDealt Subtracts damage dealt from health
	 */
	public void takeDamage(double damageDealt)
	{
		this.health -= damageDealt;
	}
	

	
	//----------------Classic Mutator Methods------------------------
	
	/**
	 * @return Characters Attack
	 */
	public double getAttack()
	{
		return attack;
	}
	
	/**
	 * 
	 * @param newAttack Characters new attack
	 */
	public void setAttack(double newAttack)
	{
		this.attack = newAttack;
	}
	
	/**
	 * 
	 * @return Characters Health
	 */
	public double getHealth()
	{
		return health;
	}
	
	/**
	 * 
	 * @param newHealth Changes Characters health
	 */
	public void setHealth(double newHealth)
	{
		this.health = newHealth;
	}
	
	/**
	 * 
	 * @return Characters level
	 */
	public int getLevel()
	{
		return level;
	}
	
	/**
	 * 
	 * @param newLevel Sets characters level
	 */
	public void setLevel(int newLevel)
	{
		this.level = newLevel;
	}
	
	/**
	 * Increments characters level by one
	 */
	public void incrementLevel()
	{
		level++;
	}

	/**
	 * 
	 * @param newAbility Adds ability to characters abilities
	 */
	public void addAbility(Skill newAbility)
	{
		abilities.add(newAbility);
	}

}
