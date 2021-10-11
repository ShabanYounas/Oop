package muPkg;

import java.util.ArrayList;
import java.util.Scanner;

public class Oop {

	ArrayList<Student> students = new ArrayList<Student>();
	public Oop()
	{
		System.out.println("Hello World Yet Again!");
	
	

	students.add(new Student("Bob",18,70.5));
	students.add(new Student("Mary",23,86.7));
	students.add(new Student("John",19,55.2));
	students.add(new frenchStudent("Jane Brown",19,65.5));
	students.add(new ComputerScience("shaban ", 28, 68.9));
	
	/*int sum = 0;
	for(Student s : students)
	{
		sum = sum + s.getAge();
	}
	int mean = sum/students.size();
    System.out.println(" The avrage student age in the course is " + mean ); 
	
    
	
	for (Student x :students) {
		x.speak();
	}*/
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Oop();
		Scanner s = new Scanner(System.in);
		while(true) {
			String name;
			String age;
			int mark;
			System.out.println("Name? ");
			name = s.nextLine();
			System.out.println("Age? ");
			mark = s.nextInt();
			System.out.println(" What was your coursework Mark? ");
			mark = s.nextInt();
		try {
				age=s.nextLine();
				
			}
			catch(Exception ex)
			{
				System.out.println("Age must be an integer");
						}
		s.close();
			
		}


}
}

