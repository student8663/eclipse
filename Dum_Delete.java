package Dummy;

public class Dum_Delete {
	
	string array 에서 null value 를 맨뒤로 보내는 연습 
	index 를 먼저 찾고 
	뒤로 보낸다 
	
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
