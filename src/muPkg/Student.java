package muPkg;

public class Student {
	protected String name="Unknown";
	protected int age=18;
	protected double mark=40.0;
	
	
	public Student(String name, int age, double mark) {
		super();
		this.name = name;
		this.age = age;
		this.mark = mark;
		
	}

	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public double getMark() {
		return mark;
	}


	public void setMark(double mark) {
		this.mark = mark;
	}
	
	public void speak() {
		System.out.println(" Hello my name is " +  name );
	}

}
