package CharacterStuff;

import java.util.ArrayList;
import UserInterface.Controller;

public class Party {
	private static ArrayList<PlayableCharacter> characters = new ArrayList<PlayableCharacter>();
	private static PlayableCharacter selectedCharacter = null;
	private static boolean hasCharacters = false;
	
	public static void addCharacter()
	{
		System.out.print("\nEnter a character name: ");
		String name = Controller.getStringResponse();
		PlayableCharacter newCharacter = new PlayableCharacter(name, 20, 10);
		
		characters.add(newCharacter);
		if (!hasCharacters)
		{
			selectedCharacter = characters.get(0);
			hasCharacters = true;
		}
	}
	
	public static boolean gameOver()
	{		
		for (PlayableCharacter character:characters)
		{
			if (character.isAlive())
				return false;
		}
		
		return true;
	}
	
	public static boolean partyExists()
	{
		return hasCharacters;
	}
	
}
