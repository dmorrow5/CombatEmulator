package UserInterface;

class StartScreen {
	
	public static void runStartUp() {
		
		displayStartMenu();
		int response = Controller.getResponse();
		
		switch (response) {
			case 1:
				System.out.println("New Game Starting!\n");
				Driver.currentState = GameState.newGame;
				break;
			case 2:
				System.out.println("No save files detected\n");
				Driver.currentState = GameState.loadGame;
				break;
			case 3:
				Driver.currentState = GameState.bootUp;
				System.out.println("GoodBye!");
				break;
			default:
				System.out.println("Incorrect Option");
		}
	}

	public static void splashScreen() {
		System.out.println(" ______________________________________ ");
		System.out.println("|                                      |");
		System.out.println("|                                      |");
		System.out.println("|                                      |");
		System.out.println("|                                      |");
		System.out.println("|                                      |");
		System.out.println("|              ITEM WORLD              |");
		System.out.println("|                                      |");
		System.out.println("|                                      |");
		System.out.println("|                                      |");
		System.out.println("|______________________________________|");
		System.out.println("\n\n\n");
		
		try {
			Thread.sleep(1500);
		} catch (Exception ex){
			System.out.println("Error: " + ex);
		}
		
	}
	
	public static void displayStartMenu() {
		System.out.println("Select an option:");
		System.out.println("[1] New Game");
		System.out.println("[2] Load File");
		System.out.println("[3] Quit");
	}
}
