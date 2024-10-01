package automationpro;


public class ChildClassTwo extends InheritanceHeirarchichal{
	
	public void displayTwo()
	{
		System.out.println("child class two");
	}
	
	public static void main(String[] args) {
		
		ChildClassTwo obj=new ChildClassTwo();
		obj.display();
		//since it is public we can create the object of the other subclass here itself.
		ChildClassOne obj1=new ChildClassOne();
		obj1.displayOne();
		obj.displayTwo();
	}

}
