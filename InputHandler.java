package CP;
import java.time.*;
import java.util.*;

public class InputHandler {
	public static Scanner scanner = new Scanner(System.in);
	public static LocalDate date;
	
	public static LocalDate getValidDate(String string) {
		System.out.println(string);
		int month, day, year;
		do {
			month = getValidInt("Month: ");
			
			day = getValidInt("Day: ");
			
			year = getValidInt("Year: ");
			
		}while(!isValidDate(month, day, year));
		
		return date;
		
	}
	
	public static boolean isValidDate(int month, int day, int year) {
		try {
			date = LocalDate.of(year, month, day);
			return true;
		}catch(Exception e) {
			System.out.println("Invalid input");
			return false;
		}
	}
	
	public static int getValidInt(String string) {
		System.out.println(string);
		
		while(!scanner.hasNextInt()) {
			System.out.println("invalid input try again");
			scanner.nextLine();
		}
		
		int validInt = scanner.nextInt();
		return validInt;
	}
	
	public static int getValidInitialBalance(String string) throws LowBalanceException {
		System.out.println(string);
		int balance;
		do {
		balance = getValidInt("balance: ");
		}while(!isOver1000(balance));
			
		
		
		return balance;	
		
	}
	
	public static boolean isOver1000(int balance) throws LowBalanceException{
		try {
			if(balance > 1000)
				return true;
			else {
				throw new LowBalanceException();
				}
		}catch(LowBalanceException lbe) {
			System.out.println("minimum is 1000");
			return false;
		}
	}
	
	
	
	
}
