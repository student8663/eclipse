package Dummy;
import java.util.*;

public class Dum {
	

	public static void main(String[] args) {
		Student[] students = new Student[3];
		fillArray(students);
		runApp(students);
//		Scanner input = new Scanner(System.in);
//		System.out.println("saf");
//		String a = input.nextLine();
//		if(a.equals("a"))
//			System.out.println("Asdf");
		
	}
	
	public static Student[] fillArray(Student[] students) {
		for(int i = 0; i < students.length; i++) {
			students[i] = getInformation();
		}
		return students;
	}
	
	public static Student getInformation() {
		Scanner userInput = new Scanner(System.in);
		System.out.print("name: ");
		String name = userInput.nextLine();
		System.out.print("id: ");
		int id = userInput.nextInt();
		
		Student newStudent = new Student(id, name);
		return newStudent;
	}
	
	public static void runApp(Student[] students) {
		Scanner userInput = new Scanner(System.in);
		boolean isExist = false;
		while(true) {
			userInput.nextLine();
			System.out.print("id or name : ");
			String command = userInput.nextLine();
			System.out.println(command);
			
			if(command.equals("id")) {
				System.out.print("id: ");
				int userId = userInput.nextInt();
				for(Student student : students) {
					if(student.getId() == userId)
						isExist = true;
				}
				if(isExist)
					System.out.println("exist");
				else
					System.out.println("not exist");
			}else if(command == "name") {
			
			} else 
				break;
			
		}
	}

}
