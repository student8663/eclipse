package Dummy;

public class Dum_Delete {
	/*
	 * student class id and name
	 * 5 max 
	 * store information in array 
	 * 
	 * create 
	 * display
	 * update
	 * delete 
	 * exit
	 * 
	 * 
	 */
	
	/*
	 * initialize object in student class 
	 * 
	 * create - id name - duplicate + 5 max 
	 * display 
	 * update - id search
	 * delte - id search
	 * 
	 * 
	 */
	
	/*
	 * student array size 5
	* while true
	* print create display update delete exit
	* switch 
	* create - create()
	 * 
	 * 
	 * create method takes in and return array 
	 * problem: don't know which index is empty - static field - studentcount
	 * studentcount = 0 .getnameandid method - in this method duplicate inspection 
	 * if studentcount == 5 print out of bounds return array 
	 * else - continue
	 * 
	 * 
	 * delete method - problem: deleted index is in the middle, how to create new in that position 
	 * static deletedIndex - what if deleted multiple id? 
	 * array sort 
	 * 
	 * array sort method takes in array and return array
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		
		String[] my = {"j", "k", null ,"l", "m"};
		int nullIndex = findNullIndex(my);
		sortArray(my, nullIndex);
		for(String i : my)
			System.out.println(i);
	
		}
		
	
	
	public static int findNullIndex(String[] my) {
		for(int i = 0; i < my.length; i++) {
			if(my[i] == null)
				return i;
				
		}
		return -1;
	}
	
	public static String[] sortArray(String[] my, int index) {
		String temp;
		for(int i = index; i < my.length - 1; i++) {
			temp = my[i];
			my[i] = my[i + 1];
			my[i + 1] = temp;
		}
		return my;
	}

}
