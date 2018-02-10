package CharacterStuff;

public abstract class Character {
	private int maxHP;
	private int currentHP;
	private int baseAttack;
	private boolean alive;
	private Skill[] skills;
	private String name;
	
	public Character(String name, int maxHP, int baseAttack)	{
		this.name = name;
		this.maxHP = maxHP;
		this.currentHP = maxHP;
		this.baseAttack = baseAttack;
		alive = true;
	}
	
	public void takeDamage(int damage){
		if (currentHP < damage) {
			currentHP = 0;
			alive = false;
		} else
			currentHP -= damage;
	}
	
	public void restoreHealth(int health) {
		if (alive) {
			if ((currentHP + health) < maxHP)
				currentHP += health;
			else
				currentHP = maxHP;
		}
	}
	
	public Skill getSkill(int skillSlot) {
		return skills[skillSlot];
	}
	
	public void setSkill(Skill newSkill, int skillSlot) {
		skills[skillSlot] = newSkill;
	}
	
	public int getHealth() {
		return this.currentHP;
	}
	
	public int getMaxHealth() {
		return this.maxHP;
	}
	
	public int getAttack() {
		return this.baseAttack;
	}
	
	public void setAttack(int newAttack) {
		this.baseAttack = newAttack;
	}
	
	public boolean isAlive() {
		return this.alive;
	}
	
	public String toString() {
		return name;
	}
}
