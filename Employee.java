
/*Q. Write a Java program to create a class called "Employee" with a name, job title, and salary attributes, and methods to calculate and update salary.*/


package demoClass;

public class Employee {
			String name;
			String jobTitle;
			double salary;

    
    public Employee(String name, String jobTitle, double salary) {       //  USING  Constructor
        this.name = name;
        this.jobTitle = jobTitle;      // .this is used here for the ---> refrence of a current class variable
        this.salary = salary;
    }

    
    public String getName() {     //  Getter methods
        return name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    
    public double calculateAnnualSalary() {    // Method  calculate annual salary
        return salary * 12;
    }

    
    public void updateSalary(double newSalary) {   // Method  update the salary
        salary = newSalary;
        System.out.println("Salary updated for " + name + ": INR " + salary);
    }

    public static void main(String[] args) {
        
    	
        Employee employee = new Employee("Kunal Kadam", "Software Engineer", 40000);

        
        System.out.println("Employee Details:");                   // Print employee details
        System.out.println("Name: " + employee.getName());
        System.out.println("Job Title: " + employee.getJobTitle());
        System.out.println("Salary: INR " + employee.getSalary());

        
        System.out.println("Annual Salary: INR " + employee.calculateAnnualSalary());     // Calculate and print annual salary

        
        employee.updateSalary(55000);  // Update the salary

        
        System.out.println("Updated Salary: INR " + employee.getSalary());      // Print updated salary
    }
}
