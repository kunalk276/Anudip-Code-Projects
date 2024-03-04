package kunal;

public class BoxingUnbpxingExample {

	public static void main(String[] args) {
		
		//Boxing
		
		byte b=10; 			  // primitive data type
		Byte B=new Byte(b);  // wrapping primitive type data into byte object
	
	
		short a=10;        	    // primitive data type
		Short s=new Short(a);  // wrapping primitive type data into short object
	
		
		
		// Auto-Boxing
		
		byte b1=10; 			  // primitive data type
		Byte B1=b1;  			 // wrapping primitive type data into byte object
	
		
		//UnBoxing
		
		Byte B2=new Byte((byte)10);  // Object type
		byte b2=B2.byteValue();		 // Unwrapped Byte object to byte data
		
		
		//Auto - Unboxing
		
		Byte B3=new Byte((byte)10);  // Object type
		byte b3=B3;		 

		
		// Print statements
		System.out.println("Byte value: " + b);
		
	}

}
