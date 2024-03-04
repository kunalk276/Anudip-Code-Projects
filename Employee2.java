package inheritance;

class Employee {
    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double calculateSalary() {
        	
        return baseSalary;
    }
}

class Manager extends Employee {
    private double bonus;

    public Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    
    public double calculateSalary() {
       	
        return baseSalary + bonus;
    }
}

class Programmer extends Employee {
    private int linesOfCode;
    private double ratePerLine;

    public Programmer(String name, double baseSalary, int linesOfCode, double ratePerLine) {
        super(name, baseSalary);
        this.linesOfCode = linesOfCode;
        this.ratePerLine = ratePerLine;
    }

    
    public double calculateSalary() {
       	
        return baseSalary + (linesOfCode * ratePerLine);
    }
}

public class Employee2 {
    public static void main(String[] args) {
        Manager manager = new Manager("John", 50000, 10000);
        Programmer programmer = new Programmer("Alice", 60000, 1000, 0.1);

        System.out.println("Manager's salary: $" + manager.calculateSalary());
        System.out.println("Programmer's salary: $" + programmer.calculateSalary());
    }
}

