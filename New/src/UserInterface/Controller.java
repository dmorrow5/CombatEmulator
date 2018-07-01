package UserInterface;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Controller {

	public static int getResponse() {
		
		int response = -1;
		Scanner controller = new Scanner(System.in);
	 
		try {
			while (!controller.hasNextInt()) {}
			
			response = controller.nextInt();
				
		} catch (InputMismatchException ex) {
			System.out.println("Option Doesn't Exist");
		} catch (NoSuchElementException ex) {
			System.out.println("NoSuchElementException: " + ex);
		} catch (Exception ex) { 
			System.out.println("Error!");
		} 
		finally
		{
//			controller.close();
//			controller = null;
		}

		return response;
	}
	
	@SuppressWarnings("resource")
	
	public static String getStringResponse() {
			
		return new Scanner(System.in).nextLine();
	}
}
