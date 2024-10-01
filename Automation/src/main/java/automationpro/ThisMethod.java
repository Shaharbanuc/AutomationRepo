package automationpro;

public class ThisMethod {
	int a=5;
	int b=10;
	int sum;
	public ThisMethod()
	{
		System.out.println("constructor");
		this.add();
		
	}
	
	public void add()
	{
		
		sum=a+b;
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		
		ThisMethod obj=new ThisMethod();

	}

}
