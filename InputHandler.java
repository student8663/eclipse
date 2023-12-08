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
			System.out.print("Month: ");
			while(!scanner.hasNextInt()) {
				System.out.print("invalid input try again ");
				scanner.nextLine();
			}
			month = scanner.nextInt();
			
			System.out.print("Day: ");
			while(!scanner.hasNextInt()) {
				System.out.print("invalid input try again ");
				scanner.nextLine();
			}
			day = scanner.nextInt();
			
			System.out.print("Year: ");
			while(!scanner.hasNextInt()) {
				System.out.print("invalid input try again ");
				scanner.nextLine();
			}
			year = scanner.nextInt();
			
			
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
	
	
}
