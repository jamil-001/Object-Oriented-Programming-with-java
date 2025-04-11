
abstract class Employee {
    private String name;
    private String employeeID;
    protected double salary;  

    public Employee(String name, String employeeID, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }

    public String getEmployeeID() {
        return employeeID;
    }
    public abstract double calculateEarnings();
    public abstract void displayInfo();
}
class FullTimeEmployee extends Employee {
    public FullTimeEmployee(String name, String employeeID, double monthlySalary) {
        super(name, employeeID, monthlySalary);
    }
    public double calculateEarnings() {
        return salary;
    }

    public void displayInfo() {
        System.out.println("Full-Time Employee");
        System.out.println("Name: " + getName());
        System.out.println("Employee ID: " + getEmployeeID());
        System.out.println("Monthly Earnings: $" + calculateEarnings());
    }
}
class PartTimeEmployee extends Employee {
    private int hoursWorked;
    public PartTimeEmployee(String name, String employeeID, double hourlyRate, int hoursWorked) {
        super(name, employeeID, hourlyRate);
        this.hoursWorked = hoursWorked;
    }
    public double calculateEarnings() {
        return salary * hoursWorked; 
    }
    public void displayInfo() {
        System.out.println("Part-Time Employee");
        System.out.println("Name: " + getName());
        System.out.println("Employee ID: " + getEmployeeID());
        System.out.println("Earnings: $" + calculateEarnings());
    }
}

public class task03{
    public static void main(String[] args) {
        Employee fullTimeEmp = new FullTimeEmployee("Alice Johnson", "FT123", 5000.00);
        Employee partTimeEmp = new PartTimeEmployee("Bob Smith", "PT456", 20.0, 80);

        fullTimeEmp.displayInfo();
        System.out.println();
        partTimeEmp.displayInfo();
    }
}
