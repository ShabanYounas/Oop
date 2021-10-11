package muPkg;

public class ComputerScience extends Student {
	

	public ComputerScience(String name, int age, double mark) {
		super(name, age, mark);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		super.speak();
		System.out.println(" Hello world! ");
	}

}
