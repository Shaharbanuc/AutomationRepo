package automationpro;

public class PolymorphismProChild 
//extends PolymorphismProParent
{
	public void sample()
	{
		//super.sample();
		System.out.println("Child Class");
	}

	public static void main(String[] args) {
		
		PolymorphismProChild obj=new PolymorphismProChild();
		obj.sample();
		
		PolymorphismProParent objparent=new PolymorphismProParent();
		objparent.sample();
	}

}
