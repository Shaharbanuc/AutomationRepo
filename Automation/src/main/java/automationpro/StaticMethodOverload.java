package automationpro;

public class StaticMethodOverload {
	
	public static void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}

	public static void add(int a,int b,int d)
	{
		int c=a+b+d;
		System.out.println(c);
	}
	public static void add(float a,int b)
	{
		float c=a+b;
		System.out.println(c);
	}
	
	public static void main(String[] args)
	{
		StaticMethodOverload.add(3,5);
		StaticMethodOverload.add(3,1,5);
		StaticMethodOverload.add(3.67f,5);

	}

}
