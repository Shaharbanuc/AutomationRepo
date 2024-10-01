package automationpro;

public class ThisConstructor {
	
	//Calling default constructor from parameterized constructor:
	public ThisConstructor()
	{
		System.out.println("default constructor");
	}
	public ThisConstructor(int a)
	{
		this();//should be the first line when writing inside constructor
		System.out.println("parameterized constructor, value of a is"+a);
	}
	

	public static void main(String[] args) {
		
		ThisConstructor obj=new ThisConstructor(3);

	}

}
