package SecondPackage;
//String builder mutable
//convert into string by using toString()
public class T {

	public static void main(String[] args) {
		StringBuilder stringB = new StringBuilder("Hello world");
		stringB.append(" folks");
		stringB.delete(0, 5);
		stringB.insert(0, "Hello");
	
		System.out.println(stringB);
		
		String string = stringB.toString();	
		System.out.println(string);
	}
	
	

}
