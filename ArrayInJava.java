package kunal;

public class ArrayInJava {

	static void methodOne(double d[])
	{
		d[2]= 20.20;  // changing the value of element at index 2
		d[2]= 21.22;  // changing the value of element at index 5
		
		
	}
	
	
	public static void main(String[] args) {
		
		double [] d=new double [8];
		
		d[2]= 11.20; //changing the the value of element at index 2
		
		d[5]= 12.25; //changing the the value of element at index 5
		
					 // by default index value is NULL
		
		
		methodOne(d);  // it can call without declare its variable
		
		System.out.println(d[2]);
		System.out.println(d[5]);
	}

}
