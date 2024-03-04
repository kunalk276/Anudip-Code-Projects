
/* OOPs Concepts 
 * Encapsulation
 * 
 * 
*/


package oops;

class Student
{
	int id;
	String name;
	String address;
	String email;
	
	
	void display()
	{
		System.out.println(id+" "+name+" "+address+" "+email);
	}
}



public class EncapsulationExample {

	public static void main(String[] args) {
		
	Student st1=new Student();
	
	st1.id=1;
	st1.name="KK";
	st1.address="Pune";
	st1.email="KK@gmail.com";
	
	}

}
