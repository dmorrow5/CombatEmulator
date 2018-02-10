package CharacterStuff;

public class PlayableCharacter extends Character {
	private int level;
	double experience;
	double nextLevelXP;
	
	public PlayableCharacter(String name, int maxHP, int baseAttack) {
		super(name, maxHP, baseAttack);
		level = 1;
		experience = 0;
		nextLevelXP = 100;
	}
	
	public void experienceGained(double experience) {
		this.experience += experience;
		
		if (this.experience > nextLevelXP)
			levelUp();
	}
	
	public void levelUp() {
		level++;
		experience -= nextLevelXP;
		nextLevelXP *= 1.1;
		
		setAttack((int) Math.floor(getAttack() * 1.1));
		
		if (experience >= nextLevelXP)
			levelUp();
	}
	
	public int getLevel() {
		return this.level;
	}
}
