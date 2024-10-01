package automationpro;

public class DemoPro {
	
	static int a=2;
	int b=4;
	
public void display()
{
	int c=7;
	System.out.println("local variable "+c);
	System.out.println("instance variable "+b);
}
	public static void main(String[] args) {
//System.out.println("welcome");
//System.out.println("welcome back");
		DemoPro obj=new DemoPro();
		System.out.println("static variable "+a);
		System.out.println("instance variable "+obj.b);
		obj.display();
	}

}
