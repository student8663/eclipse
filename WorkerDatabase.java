package Ass2;
import java.util.*;
public class WorkerDatabase {

	public static void main(String[] args) throws InvalidNameException{
		
		Industry ind = null;
		String input; // 원래는 저 do{} 안에서 initialization 했는데 while condition 까지 out of scope 이기때문에
		//여기서 declare 먼저한다 
		
		do {
			input = Input.getString("enum");		
		}while(!isValidEnum(input));
		ind = Industry.valueOf(input);
		System.out.println(ind);
		
		Industry ind = null;
		while(ind == null) {
			String input = Input.getString("Enum");
			try {
				ind = Industry.valueOf(input);
			}catch(Exception e) {
				System.out.println("invalid");
			}
		}
		
		System.out.println(ind);
		
	}
	
	public static boolean isValidEnum(String input) {
		try {
			Industry ind = Industry.valueOf(input);
			return true;
		}catch(Exception e){
			System.out.println("Invalid");
			return false;
		}
	}

}
