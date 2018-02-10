package CharacterStuff;

public class NPC extends Character {
	private double experienceRewarded;
	
	NPC(int maxHP, int baseAttack, String name, double experienceRewarded) {
		super(name, maxHP, baseAttack);
		this.experienceRewarded = experienceRewarded;
	}
	
	public double getXPReward() {
		return experienceRewarded;
	}
}
