package UserInterface;

class MainMenu {
	
	public static void runMainMenu() {
		
		displayMenuOptions();
		int response = Controller.getResponse();
		switch (response) {
		case 1:
			System.out.println("Entering Battle Setup!\n");
			Driver.currentState = GameState.beginBattle;
			break;
		case 2:
			System.out.println("Entering Character Creation!\n");
			Driver.currentState = GameState.beginCreateCharacter;
			break;
		case 3:
			System.out.println("Character Healed!\n");
			Driver.currentState = GameState.beginHeal;
			break;
		case 4:
			System.out.println("Entering Save Menu!\n");
			Driver.currentState = GameState.beginSave;
			break;
		case 5:
			System.out.println("GoodBye!");
			Driver.currentState = GameState.bootUp;
			
			break;
		default:
			System.out.println("Incorrect Option");
				
		}
	}
	
	public static void displayMenuOptions() {
		System.out.println("Select an option:");
		System.out.println("[1] Battle");
		System.out.println("[2] Create a Character");
		System.out.println("[3] Heal");
		System.out.println("[4] Save File");
		System.out.println("[5] Quit");
	}
}
