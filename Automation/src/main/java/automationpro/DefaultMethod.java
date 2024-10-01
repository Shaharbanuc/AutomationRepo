package automationpro;
//get a number and string from main method and print it in a default instance method
//method is not parameterized
public class DefaultMethod {
	int a;
	String s;
	public DefaultMethod(int a,String s)
	{
		this.a=a;
		this.s=s;
	}
	
	public void display()
	{
		
		System.out.println(a+" "+s);
	}

	public static void main(String[] args) {
		
		DefaultMethod obj=new DefaultMethod(2,"hi");
		
		obj.display();
	}

}
