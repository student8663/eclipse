package Dummy;
import java.util.*;
// 처음꺼는 enter key 눌르면 오류가 안뜨고 기다림 하지만 두번째거는 immediately return false 
// scanner.hasNextInt(), it doesn't immediately return false because the hasNextInt() method is looking for the next token (in this case, an integer). 
// It doesn't consume the newline character until you attempt to read the actual integer using a method like nextInt().
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
