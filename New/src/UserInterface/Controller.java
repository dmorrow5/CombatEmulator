package UserInterface;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

class Controller {
	
	protected static int getResponse() {
		
		Scanner controller = new Scanner(System.in);
		int response = -1;
	 
		while (response == -1) {
			try {
				if (controller.hasNextInt()) {
					response = controller.nextInt();
				}
			} catch (InputMismatchException ex) {
				System.out.println("Option Doesn't Exist");
			} catch (NoSuchElementException ex) {
				System.out.println("NoSuchElementException: " + ex);
			} catch (Exception ex) { 
				System.out.println("Error!");
			} 
		}
		
		if (controller != null) {
			controller.close();	
			controller = null;
		}
		
		return response;
	}
}