package CP;
import java.time.*;
import java.util.*;
// month day year 를 int 로 받는 검사 + 제대로 된 날짜 검사 . flow chart 를 그려보면 approach 가 쉬울수 있따 
// int 검사 3 개 while 과 hasnextint 이용해서 하면 된다 먼저 3 개 하고 날짜 검사이므로 do while 이용
// int 도 getValidInt 만들어서 간략하게 줄일수 있다 

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
