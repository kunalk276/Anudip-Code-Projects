
// Access outrt class from inner class
// They can access
package innerdemo;

class Outer 
{
	int x=25;
	
	class Inner
	{
		int y=50;
		
		public int innerMethod()
		{
			return x;

		}
		
	}
}


public class AccessOuterMainExample {

	public static void main(String[] args) {
		
		Outer out=new Outer();
		Outer.Inner in =out.new Inner();
		System.out.println(in.innerMethod());
	}

}
