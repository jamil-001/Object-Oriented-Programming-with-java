class Animal{
     String name;
     int age;
     Animal(String name,int age){
        this.name = name;
        this.age = age;

     }
    void sound(){
        System.out.println("Animal make sound");
     }
     int factorial(int age){
         return (age <= 1)? 1 : age * factorial(age-1); 
     }
}
class Dog extends Animal{
      Dog(String name,int age){
        super(name, age);
      }
      void sound(){
        System.out.println("the dog barks");
      }
      void display(){
        System.out.println("Dog Name: "+ name + "\nAge: " + age);
        sound();
        System.out.println("The factorial of " + age +" is "+ (factorial(age)));
      }
}
class Cat extends Animal{
      Cat(String name,int age){
        super(name, age);
      }
      void sound(){//method override
        System.out.println("The cat meows");
      }
      void display(){
        System.out.println("Cat Name "+ name +"\nAge: "+ age);
        sound();
        System.out.println("The factorial of "+ age +" is "+ (factorial(age)));
      }
}
public class task02 {
    public static void main(String[] args) {
        Dog d = new Dog("Iron",7);
        Cat c = new Cat("Tusk",5);
        d.display();
        System.out.println();
        c.display();
    }
}
