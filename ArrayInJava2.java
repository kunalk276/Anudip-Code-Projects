package kunal;

class A
{
	int i;

}

public class ArrayInJava2 {

	static void methodOne(A[] a)
	{
		a[2].i=25; // changing value field of A type refered by element at index 2
		a[5].i=45;
	}
	
	
	
	public static void main(String[] args) {
		
		A[] a =new A[8];
		
		a[2] =new A(); // creating A-type object and assigining it to element at indeex 2
		a[5] =new A();
		
		a[2].i=10; // Changing value of field of A-type object refered by element at index 2
		a[5].i=22;
		
		
		methodOne(a); // Calling Method
		
		System.out.println(a[2].i); // 
		System.out.println(a[5].i);
		
		
		
		
		
	}

}
