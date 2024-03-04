package demoClass;

class SampleDemo // second class declare
{
	int x=5; // variable declaration & inilization
	
	public void SampleDemoMethod() // second method defining
	{
		System.out.println("Value of x for SampleDemoMethod : "+x); // login second method
	}
	
}

public class SecondProgram { // class declare
	 int x=20;				// variable declaration & inilization
	
	public void method1()  // Method definition (calling Method)
	{
		System.out.println("Value of x for method 1 : "+x); // login method
	}	
	
	
	public void method2()  // Method definition (calling Method)
	{
		System.out.println("Value of x for method 2 : "+x); // login method
	}	
	
	
	
	public static void main(String[] args) { // starting point of execute by jvm
		
		SecondProgram sp1=new SecondProgram(); // object created
		sp1.method1();  // Calling method
		
		
		
		SampleDemo sdm1=new SampleDemo(); // Second method object created
		
		sdm1.SampleDemoMethod();  // Calling method
		
	}

}
