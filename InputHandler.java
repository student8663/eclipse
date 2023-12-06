package Dummy;
import java.util.*;

public class InputHandler {
	private static Scanner input = new Scanner(System.in);
	
	public static int getInt(String string) {
		System.out.println(string);
		while(!input.hasNextInt()) {
			System.out.println("Wrong input");
			input.nextLine();
		}
		
		int userInput = input.nextInt();
		input.nextLine();
		
		return userInput;
	}
	
	public static int getInt2(String string) {
		String userStringInput;
		int userIntInput;
		//while print store try parse return catch print 
		while(true) {
			System.out.println(string);
			userStringInput = input.nextLine();
			try {
				userIntInput = Integer.parseInt(userStringInput);
				return userIntInput;
			}catch(NumberFormatException ex) {
				System.out.println("invalid input");
			}
		}
	}
	
	
	
	
	
}
