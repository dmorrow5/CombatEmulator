package utilities;

public abstract class Skill {
	
	//---------------------Variables-----------------------------
	private String name;
	private int manaCost;
	private double damage;
	
	//-------------------Constructors----------------------------
	
	/**
	 * Primary Constructor
	 * @param newName Name of Ability
	 * @param newManaCost Cost of Ability
	 * @param newDamage Damage dealt by Ability
	 */
	public Skill(String newName, int newManaCost, double newDamage)
	{
		this.name = newName;
		this.manaCost = newManaCost;
		this.damage = newDamage;
	}
	
	
	//------------------Mutator Methods----------------------------
	
	/**
	 * 
	 * @return Name of Ability
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * 
	 * @param newName Changes name of Ability
	 */
	public void setName(String newName)
	{
		this.name = newName;
	}
	
	/**
	 * 
	 * @return Cost of Ability
	 */
	public int getManaCost()
	{
		return manaCost;
	}
	
	/**
	 * 
	 * @param newManaCost Changes cost of Ability
	 */
	public void setManaCost(int newManaCost)
	{
		this.manaCost = newManaCost;
	}
	
	/**
	 * 
	 * @return Damage Ability deals
	 */
	public double getDamage()
	{
		return damage;
	}
	
	/**
	 * 
	 * @param newDamage Changes damage Ability deals
	 */
	public void setDamage(double newDamage)
	{
		this.damage = newDamage;
	}
	
	
}
