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
        int coutn = 0;
        for(char c : name.toLowerCase().toCharArray()){
          if("aeiou".indexOf(c) != -1){
            coutn++;
          }
        }
        return coutn;
      }
}
class Manager extends Employee{
  String department;
        Manager(String name,int employeeid,double salary,String deparment){
          super(name,employeeid,salary);
          this.department = deparment;
        }
    void display(){
      System.out.println("Manager information:");
      System.out.println("Name: "+ name + " and it contain "+ countVowels());
      System.out.println("Employee ID: "+ employeeid);
      System.out.println("Salary: $"+ salary);
      System.out.println("Department: "+ department);
    }
}
class Developer extends Employee{
      String language;
      Developer(String name,int employeeid,double salary,String language){
        super(name, employeeid, salary);
        this.language = language;
      }
    
      void display(){
        System.out.println("Developer information: ");
        System.out.println("Name: "+ name + "and it contain "+ countVowels() + "Vowels");
        System.out.println("Employee ID: "+ employeeid);
        System.out.println("Salary: $"+ salary);
        System.out.println("Programming languages: "+ language);
      }
}
public class practic {
    public static void main(String[] args) {
      Manager m = new Manager("sasuke",101,8000.0,"HR");
      Developer d = new Developer("Naruto",234,7000.0,"Java");
      m.display();
      System.out.println();
      d.display();
    } 
}

