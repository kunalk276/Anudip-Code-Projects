package lab5;

abstract class Employee {
    protected String name;
    protected int employeeId;

    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    abstract double calculateSalary();
    abstract void displayInfo();
}

class Manager extends Employee {
    private double baseSalary;
    private double bonus;

    public Manager(String name, int employeeId, double baseSalary, double bonus) {
        super(name, employeeId);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    @Override
    double calculateSalary() {
        return baseSalary + bonus;
    }

    @Override
    void displayInfo() {
        System.out.println("Manager Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: " + calculateSalary());
    }
}

class Programmer extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public Programmer(String name, int employeeId, double hourlyRate, int hoursWorked) {
        super(name, employeeId);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    void displayInfo() {
        System.out.println("Programmer Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: " + calculateSalary());
    }
}

public class Main2 {
    public static void main(String[] args) {
        Manager manager = new Manager("John Doe", 1001, 5000, 1000);
        manager.displayInfo();

        System.out.println();

        Programmer programmer = new Programmer("Jane Smith", 1002, 50, 160);
        programmer.displayInfo();
    }
}
