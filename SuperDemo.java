package oops;

class SuperPrime
{
	String Name1;
}

public class SuperDemo extends SuperPrime {

	String name;
	
	public void details()
	{
		super.Name1="Parent";
		this.name="Child";
		System.out.println(super.Name1);
		System.out.println(name);
		
	}
	
	
	public static void main(String[] args) {
		
		SuperDemo obj = new SuperDemo();
		obj.details();

	}

}
