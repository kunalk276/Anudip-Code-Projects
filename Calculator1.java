
// METHOD OVERLOADING

// same type of datatype   using different parameter

package demo;

public class Calculator1 {

	int a, b, result;
	
	public void  add(int a , int b)
	{
		result=a+b;
		System.out.println(result);
		
	}
	
	public void add(int a, int b, int c) // 3 parameter
	{
		result=a+b+c;
		System.out.println(result);
	
	}
	
	public static void main(String[] args) {
		
		Calculator1 cal=new Calculator1();
		
		cal.add(5, 2);
		cal.add(5, 5, 5);
	}

}
