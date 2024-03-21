package com.sort;

public class Employee   // method
{
	private int empId;   // data member   private ()
	private String name;  // data member
	private double salary;  // data member
	
	
	public Employee(int empId, String name, double salary) //paramerterize constructor
	{
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}

	// Getter and setter method to get value from private data member  of class(Employee) can access in another class(EmployeIdComaprator)

		public int getEmpId()
		{
			return empId;
		}


		public void setEmpId(int empId)
		{
			this.empId = empId;
		}


		public String getName() 
		{
			return name;
		}


		public void setName(String name) 
		{
			this.name = name;
		}


		public double getSalary() 
		{
			return salary;
		}


		public void setSalary(double salary)
		{
			this.salary = salary;
		}

	@Override
	public String toString() 
	{
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
	
}
