package oops;

class Student1
{
	int rollNo; // instance variable
	String name;
	float fee;


	Student1(int rollNo, String name , float fee)  // creating refrence variable
	{
		this.rollNo=rollNo;  // .this keyword is used when instance variable use as a reference variable
		 this.name=name;    // use when same class datamember using for reference 
		 this.fee=fee;
	}

	
	//OR
//	Student1(int rollNo, String name , float fee)  // creating refrence variable
//	{
//		rollNo=roll;  
//		 name=nm;     
//		 fee=fees;
//	}

	
	
	
	void display()
	{
		System.out.println(rollNo+" "+name+" "+fee);
		
	}
}

public class studentExample {

	public static void main(String[] args) {
		
		Student1 s1=new Student1(1,"KUNAL",70007.0f); // Create instance of a student
		
		s1.display(); 
		
	}

}
