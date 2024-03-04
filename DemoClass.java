package demoClass;


class StudentDetails 
{
	int studentId;
	String studentName;
	String studAddress;
	String studentEmail;
	float marks;


	public void store()
	{
		int id=0 ;  // local variable?
		
		
	}
	public void viewStudentData()
	{
		
	}
	
	public void marksofstudent()
	{
		
	}
	
	
}
public class DemoClass {

	public static void main(String[] args) {
		
		StudentDetails obj1=new StudentDetails();
		
		obj1.viewStudentData();
		System.out.println("Student Id "+ obj1.studentId);
		obj1.marksofstudent();
		
		
		StudentDetails obj2=new StudentDetails();
		System.out.println("Student Marks "+ obj2.marks);
		obj2.marksofstudent();
		
		StudentDetails obj3=new StudentDetails();
		System.out.println("Student Name "+ obj3.studentName);
		obj2.viewStudentData();
		
		
		
		
	}

}
