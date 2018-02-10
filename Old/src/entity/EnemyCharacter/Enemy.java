package entity.EnemyCharacter;

import entity.Character;

public abstract class Enemy extends Character {
	
	//---------------------------Variables---------------------------------
	private double enemyBoostRatio;
	private EnemyType enemyType = null;

	
	//--------------------------Constructors-------------------------------
	public Enemy(EnemyType enemyType, int newLevel) {
		super(enemyType.getName(), enemyType.getAttack(), enemyType.getHealth(), newLevel);
	}
	
	
	//-------------------------Other Methods---------------------------------
	
	
	
	
	//------------------------Mutator Methods----------------------------------
	public double getEnemyBoostRatio()
	{
		return enemyBoostRatio;
	}
	
	public void setEnemyBoostRatio(double newRatio)
	{
		this.enemyBoostRatio = newRatio;
	}

}
