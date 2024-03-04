package oops;


class SuperParent
{
	String name;


	public void details()
	{
		name="Parent";
		System.out.println(name);
	}
}
public class ParentSuperDemo1 extends SuperParent {

	String name;
	
	public void details()
	{
		super.details();
		name="Child";
		System.out.println(name);
		
	}
	
	public static void main(String[] args) {
		
		ParentSuperDemo1 obj=new ParentSuperDemo1();
		
		obj.details();

	}

}
