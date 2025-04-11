class Employee{
      String name;
      String name2;
      Employee(){
        System.out.println("Default");
      }
      Employee(String name,String name2){
        this.name = name;
        this.name2 = name2;
      }
}
class Manager extends Employee{
      Manager(String name,String name2){
        super(name, name2);
      }
      void displayInfo(){
        System.out.println("Name : " + name);
        System.out.println("Department : " + name2);
      }
}
class Developer extends Employee{
    Developer(String name,String name2){
        super(name, name2);
    }
    void displayInfo(){
        System.out.println("Name : " + name);
        System.out.println("Programming Language : " + name2);
    }
}

public class task09_EmployeeHierarchy {
    public static void main(String[] args) {
        Manager manager = new Manager("Alice", "HR");
        Developer developer = new Developer("Bob", "Java");
        System.out.println("Output:");
        manager.displayInfo();
        developer.displayInfo();
        
    }
}
