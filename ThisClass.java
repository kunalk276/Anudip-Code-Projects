
//Constructor Example 

package oops;

public class ThisClass {

	int a;
	int b;
	int c;
	
	ThisClass()   // single paramertizesd constructor
	{
		this(10,20);
		System.out.println("Inside DEFAULT Constructor...");
		
	}
	
	ThisClass(int a ,int b)  // 2 paramertizesd constructor
	{
		this(10,20,30);
		a=a;
		b=b;
		System.out.println("Inside PARAMETERIZED Constructor 1 ...");
		
	}
	
	ThisClass(int a ,int b, int c)  // 3 paramertizesd constructor
	{
		a=a;
		b=b;
		c=c;
		System.out.println("Inside PARAMETERIZED Constructor 2 ...");
		
	}
	
	public static void main(String[] args) {
		
		ThisClass tis=new ThisClass();
		//ThisClass tiss=new ThisClass(20,30);
		

	}

}
