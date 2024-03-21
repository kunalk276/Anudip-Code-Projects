package stringdemo;

public class ChkImmutable 
{


	public static void main(String[] args) 
	{
		String s1 = "KUNAL";
		String s2 = "KUNAL";
		
		System.out.println(s1 == s2); 
		
		
		System.out.println(s1.concat("KADAM"));
		System.out.println(s1);
		
		
		  String s11 = new String("KUNAL");
		  
		  System.out.println(s11); //Output : JAVA
		  
		  s11.concat("KADAM");
		  
		  System.out.println(s11); //Output : JAVA
	}

}
