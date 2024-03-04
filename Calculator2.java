package demo;


//METHOD OVERLOADING

//different  type of datatype   using different parameter


public class Calculator2 {

	int a;
	float result ,b;

	public void  add(int a , float b)
	{
		result=a+b;
		System.out.println(result);
		
	}

	public void  add(int a , int b) // method 
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
		
		Calculator2 cal=new Calculator2();
		
		cal.add(5, 2.5f);
		cal.add(14, 2);
		cal.add(5, 5, 5);
	}

}
