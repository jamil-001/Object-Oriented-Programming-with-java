class Student{//class
      String name;//atribute
      int age;
      double grad;
      Student(String name,int age,double grad){//constructor
        this.name = name ;
        this.age = age;
        this.grad = grad;
      }
      void display(){//method
        System.out.println("name : " + name);
        System.out.println("age : " + age);
        System.out.println("grade : " + grad);
      }
}
public class task07 {
    public static void main(String[] args) {
        Student obj = new Student("Jamil Ahmed",22,4.00);//Object of Student class
        obj.display();
    }
}