package demoClass;

public class StaticDemo {
	
	static int a=0;
	int b;
	
	
	public void Display()
	{
		int c=0;
		a++;
		System.out.println(a);
		
	}
	
	public static void main(String[] args) {
		
		
		StaticDemo sd= new StaticDemo();
		sd.Display();
		

		StaticDemo sd1= new StaticDemo();
		sd1.Display();
		

		StaticDemo sd2= new StaticDemo();
		sd2.Display();
		
		
		
	}

}
