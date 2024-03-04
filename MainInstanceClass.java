package demoClass;

class A
{
	int nonStaticVariable;
	static int staticVariable;
	
	static void staticMethod()
	{
		System.out.println("staticmethod ="+staticVariable);
	
		

		//System.out.println(nonStaticVariable);  //Non static method can not accssible in static method
	}
	
	void nonStaticMethod() 
	{
		
		System.out.println("non static method = "+nonStaticVariable);
	}
	
	
}

public class MainInstanceClass {

	
	public static void main(String[] args) {
		A.staticVariable=10;
		//A.nonStaticVariable=10;   // no object created so cant access the variable
		
		A.staticMethod();
		
		A a1=new A();
		A a2=new A();
		System.out.println(a1.nonStaticVariable);
		System.out.println(a1.staticVariable);
		
		a1.nonStaticMethod();
		a1.staticMethod();
	
	
		System.out.println(a2.staticVariable);
		a1.staticVariable =20;
	
		
	}
	
	

}
