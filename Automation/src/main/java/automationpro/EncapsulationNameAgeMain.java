package automationpro;

public class EncapsulationNameAgeMain {

	public static void main(String[] args) {
		
		EncapsulationNameAge obj=new EncapsulationNameAge();
		obj.getter("Shanu",12);
        obj.setName();
        obj.setAge();
        System.out.println("The name is "+obj.setName()+" Age is "+obj.setAge());
	}

}
