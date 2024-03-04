package demoClass;

public class MinFloat {
	
	public double minFunction(double d , float m) // n=d,m=b  // main function   \\ Method Start
	{
		double min;
		if(d>m)
		{

			min=m;
			
		}
		else
		{
			min=d;
		}
		return min;
	}																			// Method end
	
	public static void main(String[] args) {

		MinFloat mf =new  MinFloat();
		double result=mf.minFunction(35.5, 90);
		System.out.println("Minimum Value"+result);

	}
	
}
