

class Employee{
      String name;
      int employeeid;
      double salary;
      Employee(String name,int employeeid,double salary){
        this.name = name;
        this.employeeid = employeeid;
        this.salary = salary;
      }
       int countVowels(){
        int count = 0;
        for(char c : name.toLowerCase().toCharArray()){
            if("aeiou".indexOf(c) != -1){
                count++;
            } 
        }
        return count;
      }
    
}
class Manager extends Employee{
    String department;
      Manager(String name,int employeeid,double salary,String department){
        super(name, employeeid, salary);
        this.department = department;
      }
      void display(){
        System.out.println("Manager information:");
        System.out.println("Name: " + name + " and it contains " + countVowels()+" vowels.");
        System.out.println("Employee ID: "+ employeeid);
        System.out.println("Salary: $" + salary);
        System.out.println("Department: " + department);
      }
}
class Developer extends Employee {
    String language;

    Developer(String name, int employeeid, double salary, String language) {
        super(name, employeeid, salary);
        this.language = language;
    }

    void display() {
        System.out.println("Developer Information:");
        System.out.println("Name: " + name + " and It contains " + countVowels() + " vowels.");
        System.out.println("Employee ID: "+ employeeid);
        System.out.println("Salary: $" + salary);
        System.out.println("Programming Language: " + language);
    }
}
public class task04 {
    public static void main(String[] args) {
        Manager m = new Manager("sasuke", 101, 80000.0,"HR");
        Developer d = new Developer("Naruto", 201, 70000.0,"java");
        m.display();
        d.display();
    }
}
