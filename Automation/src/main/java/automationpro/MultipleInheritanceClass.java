package automationpro;

public class MultipleInheritanceClass implements MultipleInheritance,MultipleInheritanceTwo{

	public static void main(String[] args) {
		
		MultipleInheritanceClass obj=new MultipleInheritanceClass();
		obj.add();
		obj.display();
		//Variables in interfaces are implicitly public and static, 
		//so they are accessible globally without creating an instance of the interface.
		System.out.println("The static final varibale inside interfaces are "+a+"&"+b);

	}

	@Override
	public void add() {
		int sum;
		sum=a+b;
		System.out.println("The sum of a and b are "+sum);
		
	}

	@Override
	public void display()
	{
		System.out.println("second interface");
		
	}

}
