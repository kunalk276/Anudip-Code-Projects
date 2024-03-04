package demoClass;


public class DemoExample {

	class Demo
	{
		public Demo(int a)
		{
			System.out.println("value of a "+ a*a);
		}
		
		public Demo(int a , int b)
		{
			System.out.println("Multipliction is "+ a*b);
		}
		
}
	
	public static void main(String[] args) {
	    DemoExample de = new DemoExample(); // Instantiating DemoExample object

	    Demo d1 = de.new Demo(2); // Instantiating Demo object with one parameter
	    Demo d2 = de.new Demo(2, 3); // Instantiating Demo object with two parameters
	}

	
}
