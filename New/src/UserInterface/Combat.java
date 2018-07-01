package UserInterface;

public class Combat {
	private static BattleState battleState = BattleState.outOfbattle;
	
	public static void Battle()
	{
		System.out.println("Case: " + battleState.toString());
		
		if (battleState == BattleState.outOfbattle)
		{
			System.out.println("Not in Battle!");
			return;
		}
		
		switch (battleState)
		{
		case selectEnemy:
			battleState = BattleState.battleSplashScreen;
			break;
			
		case battleSplashScreen:
			battleState = BattleState.playerTurn;
			break;
			
		case playerTurn:
			battleState = BattleState.enemyTurn;
			break;
			
		case enemyTurn:
			battleState = BattleState.endScreen;
			break;
			
		case endScreen:
			battleState = BattleState.outOfbattle;
			break;
		
			default:
				battleState = BattleState.outOfbattle;
		}
	}
	
	public static void startBattle()
	{
		battleState = BattleState.selectEnemy;
	}
	
	public static boolean battling()
	{
		if (battleState == BattleState.outOfbattle)
			return false;
		else
			return true;
	}
}
