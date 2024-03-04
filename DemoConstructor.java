package demoClass;

public class DemoConstructor {


	
	public DemoConstructor(int a) // single parameter
	{
		
	}	

	public DemoConstructor() // no parameter
	{
		System.out.println("Constructor is start");
	}
	
	public void show()
	{
		System.out.println("Normal Method.");
		
	}
	 
	public DemoConstructor(int a , int b)  // two parameter
	{
		
	}
	
	
	public void display()
	{
		
	}
	
	public static void main(String[] args) {
		
		DemoConstructor dc = new DemoConstructor();   // new keyword --> allocate the mempory to object
		
		dc.show();
	
		// Demo d=new Demo();  //  it gives error becase  Demo is Private object does not access in another class

	}

}
