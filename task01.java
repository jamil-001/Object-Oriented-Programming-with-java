class Vehicle{
    String makeBy;
    int makingYear;
    Vehicle(String makeBy,int makingYear){
        this.makeBy=makeBy;
        this.makingYear=makingYear;
    }
    void display(){
        System.out.println("Make: "+makeBy+"\nYear: "+makingYear);
    }
    boolean isPalindrome(){
        int year=makingYear, reverse=0;
        while(year>0){
            reverse=reverse*10+year%10;
            year/=10;
        }
        return reverse==makingYear;
    }
    
    
}
class Car extends Vehicle{
    int doors;
    Car(String makeBy,int makingYear,int doors){
        super(makeBy,makingYear);
        this.doors=doors;
    }
    void display(){
        System.out.println("Car information:");
        super.display();
        System.out.println("Number of doors: "+doors);
        System.out.println("This Car manufacturing year is "+(isPalindrome()?"":"not")+" a palindrom");
    }
}
class Motorcycle extends Vehicle{
    boolean sidecar;
    Motorcycle(String makeBy,int makingYear,boolean sidecar){
        super(makeBy,makingYear);
        this.sidecar=sidecar;
    }
    void display(){
        System.out.println("Motorcycle information:");
        super.display();
        System.out.println("Has sidecar: "+sidecar);
        System.out.println("This Motorcycle manufacturing year is "+(isPalindrome()?"":"not")+" a palindrom");
    }
}

public class task01 {
    public static void main(String[] args) {
        Car c= new Car("Toyota",2002,4);
        Motorcycle m=new Motorcycle("Ducati",2003,true);
        c.display();
        System.out.println();
        m.display();
    }
}
