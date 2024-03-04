package inheritance;

class ABC   // PArent c;lass
{
	public int a;
}

class PQR
{
	void display()
	{
		ABC a1 =new ABC();
		System.out.println(a1.a);
	}
}

class MNC extends ABC   // Child class
{
	void show()
	{
		ABC a1=new ABC();
		
		System.out.println(a1.a);
	}
	
}


public class MainDemo {

	public static void main(String[] args) {
		
		

	}

}
