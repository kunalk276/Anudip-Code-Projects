package oops;

class Employee
{
	public int salary; // Attribute of a Employee class
	
//	public Employee()  // No-arg constructor //
//	{
//		
//	}
	
	public Employee(int sal)  // special type of method // constructor
	{
		salary=sal;
	}
	
	public void work()  // method of a Employee  class
	{
		System.out.println("Working as a EMPLOYEE...");
	}
	
	public int getSalary()  // method
	{
		return salary;
	}
}

  

class Manager extends Employee
{
	public Manager(int sal)
	{
		super(sal);
	}
	
	public void work()
	{
		System.out.println("Managing The Employee...");
	}
	
	public void addEmployee() // Overriding the addEmployee Method
	{
		System.out.println("ADDING New Employee");
	}
}

public class EmployeeMainExample {

	public static void main(String[] args) {
		
		Employee emp =new Employee(45000);  //Create an instance of a Employee class
		
		Manager man=new Manager(70000);		// Create an instance of a Manager class
		
		emp.work();
		System.out.println("EMPLOYEE salary"+emp.getSalary());   // print employee salary
		
		man.work();
		System.out.println("Manager Salary"+man.getSalary()); // print manager salary
		
		man.addEmployee();
	}

}
