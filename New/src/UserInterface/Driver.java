package UserInterface;

import CharacterStuff.Party;
import CharacterStuff.PlayableCharacter;

public class Driver {
	
	public static GameState currentState = GameState.bootUp;

	public static void main(String[] args) {

		while (true) {
			System.out.println("Case: " + currentState.toString());
			
			switch (currentState)
			{
				case bootUp:
					StartScreen.splashScreen();
					currentState = GameState.startMenu;
					break;
					
				case startMenu:
					StartScreen.runStartUp();
					break;
					
				case newGame:
					currentState = GameState.mainMenu;
					break;
					
				case loadGame:
					System.out.println("No Save files!");
					currentState = GameState.startMenu;
					break;	
					
				case mainMenu:
					MainMenu.runMainMenu();
					break;
					
				case beginBattle:
					if (!Party.partyExists())
					{
						System.out.println("There are no characters in your party!");
						System.out.println("Entering Character wizard...");
						currentState = GameState.beginCreateCharacter;
					}
					else
					{
						Combat.startBattle();
						currentState = GameState.battle;
					}
						
					break;	
					
				case battle:
					if (Combat.battling())
						Combat.Battle();
					else
						currentState = GameState.mainMenu;
					
					break;					
					
				case beginCreateCharacter:
					Party.addCharacter();
					currentState = GameState.mainMenu;
					break;	
					
				case beginHeal:
					currentState = GameState.bootUp;
					break;	
					
				case beginSave:
					currentState = GameState.bootUp;
					break;	
				
				default:
					currentState = GameState.bootUp;
					break;
			}
		}
	}
	
	
}
