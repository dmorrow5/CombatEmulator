package entity;

public class MainCharacter extends Character {
	
	//------------------Variables-------------------------------
	private double currentExperience;
	private double remainingExperience;
	
	
	//------------------Constructors-------------------------------


	public MainCharacter(String name, double newAttack, double newHealth) {
		super(name, newAttack, newHealth, 1);
		currentExperience = 0;
		remainingExperience = 100;
	}
	
	
	//------------------Other Methods--------------------------------
	
	/**
	 * If the new experience exceeds the remaining experience, the character levels up!
	 * @param newExperience Experience character just earned
	 */
	public void addExperience(double newExperience)
	{
		currentExperience += newExperience;
		
		while (currentExperience >= remainingExperience)
		{
			levelUp();
			
			currentExperience -= remainingExperience;
			remainingExperience *= 1.75;
		}
	}
	
	public void levelUp()
	{
		System.out.println("CONGRATS, you've leveled up!");
		System.out.printf("You're now level %d!\n", level);
		
		incrementLevel();
		attack += attack*.3;
		health += health*.3;
	}

	
	//-----------------Mutator Methods------------------------------
	
	/**
	 * 
	 * @return Characters current experience
	 */
	public double getCurrentExperience()
	{
		return currentExperience;
	}
	
	/**
	 * 
	 * @param newCurrentExperience Sets characters current experience
	 */
	public void setCurrentExperience(double newCurrentExperience)
	{
		this.currentExperience = newCurrentExperience;
	}
	
	/**
	 * 
	 * @return Remaining experience until user levels-up
	 */
	public double getRemainingExperience()
	{
		return remainingExperience;
	}
	
	/**
	 * 
	 * @param newRemainingExperience Sets remaining experience til user levels-up
	 */
	public void setRemainingExperience(double newRemainingExperience)
	{
		this.remainingExperience = newRemainingExperience;
	}
}
