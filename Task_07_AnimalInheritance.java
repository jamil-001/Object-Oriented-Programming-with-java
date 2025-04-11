class Animal{
    String name;
    Animal(){
        System.out.println("Default");
    }
    Animal(String name){
        this.name = name;
    }
    void speak(){
        System.out.println("Animal make a SOUND");
    }
}
class Dog extends Animal{
    Dog(String name){
        super(name);
    }
    void speak(){
        System.out.println(name + " Barks");
    }
}
class Cat extends Animal{
    Cat(String name){
        super(name);
    }
    void speak(){
        System.out.println(name + " Meow");
    }
}

public class Task_07_AnimalInheritance {
    public static void main(String[] args) {
    Animal animal = new Animal("Generic Animal");
    Dog dog = new Dog("Buddy");
    Cat cat = new Cat("Whiskers");
    animal.speak();
    dog.speak();
    cat.speak();
    }
   }