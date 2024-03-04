package kunal;

public class ArrayJavaClone {

	public static void main(String[] args) {
		
		
		int[] a= {12,21,0,5,7};
		
		int[] b= a.clone(); // object class method
		
for(int i=0; i<b.length;i++) 
{
	System.out.println(b[i]);	
}

}
	}
