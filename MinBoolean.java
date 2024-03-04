package demoClass;
				
public class MinBoolean {
	public boolean minFunction(int n , int m) // n=a,m=b  // main function   \\ Method Start
	{
		boolean min;
		if(n>m)
		{

			min=true;
			
		}
		else
		{
			min=false;
		}
		return min;
	}			

	public static void main(String[] args) {
		
		MinBoolean mb =new  MinBoolean();
		boolean result=mb.minFunction(3, 9);
		System.out.println("Minimum Value"+result);
	}

}
