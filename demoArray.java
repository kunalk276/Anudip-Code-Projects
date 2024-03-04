package kunal;

public class demoArray {

	public static void main(String[] args) {
	/*
		int[] a= {12,21,0,5,7};
		int[] b= a;
				
		for(int i=0; i<b.length;i++)
		{
			System.out.println(b[i]);
			
		}
		a[2]=52;   //change 3rd element of array 'a'
		
		System.out.println("===============");
		System.out.println(b[2]);
		
		
		
		b[4]=100;    //change 5th element of array 'b'
		System.out.println(b[4]);
		
   */
		int[] a= {12,21,0,5,7};
		int[] b= new int[a.length];   // declare another array
		
		for(int i=0; i<a.length;i++)
		{
			b[i]=a[i];   // copying array variable of 'a' in 'b'
			
		}
		
		a[2]=56;
		System.out.println(a[2]);    //value of 3rd element in array
		
		
		b[4]=100;
		System.out.println(b[4]);
	}
	

}
