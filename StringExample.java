package stringdemo;
// using equals ()method
public class StringExample {

	
		//Concat 2 strings
	
	public static void main(String[] args) {
		
		//Concat 2 strings
		
		String name1="Kunal";
		String name2="Kadam";
		String name3=name1.concat(name2);
		
		System.out.println(name3);
		
		String name4="Kunal";
		String name5="Kadam";
		String name6=name1.concat(name5);
		
		System.out.println(name6);

		
		String s="Hell";
		String s1="Hello";
		String s2="Hello";
		
		System.out.println(s.equals(s1));
		System.out.println(s1.equals(s2));
		
		
	}

}
