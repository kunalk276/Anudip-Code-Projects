
//5/2/2024

package kunal;

public class MultiDimArray {

	public static void main(String[] args) {
	/*	// 2D array
		double[][] matrix= {
				{1.2,4.3,4.0},
				{4.1,1.1,}
				
				//instatiation and intilizatio of 
		};
		
		double[][]matrix1; //declare 2d 
		
		double [][] a= new double[3][2]; // instation
     */
		
		int [][] a= {
				{3,2,1}, 
				{9,7,6,5},
				{7,6,5}
			};
		
		System.out.println("length of row 1 "+a[0].length); 
		System.out.println("length of row 2 "+a[1].length);
		System.out.println("length of row 3 "+a[1].length);
		System.out.println(a[1][2]);
	}
	

}
