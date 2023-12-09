package CP;
import java.time.*;
import java.util.*;
// month day year 를 int 로 받는 검사 + 제대로 된 날짜 검사 . flow chart 를 그려보면 approach 가 쉬울수 있따 
// int 검사 3 개 while 과 hasnextint 이용해서 하면 된다 먼저 3 개 하고 날짜 검사이므로 do while 이용
// int 도 getValidInt 만들어서 간략하게 줄일수 있다 

//exception 만들고 출력하는거
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
