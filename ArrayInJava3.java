//Method a n array primitive type

package kunal;

public class ArrayInJava3 {

	static int[] methodOne()
	{
		int[] a=new int[8];
		a[2]=10;
		a[5]=15;
		return a;
	}
	
	public static void main(String[] args) {
		
		
		
		int [] a=methodOne();
		
		System.out.println(a[2]);
		System.out.println(a[5]);
		
		
	}

}
