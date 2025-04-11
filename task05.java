class Device{
    String brand;
    int totoalunit;
    Device(String brand,int totoalunit){
        this.brand = brand;
        this.totoalunit = totoalunit; 
    }
    void display(){
        System.out.println("Brand: "+ brand);
        System.out.println("total unit: "+ totoalunit);
    }
    void sumofdigit(){
        int sum = 0,num = totoalunit;
        while(num > 0){
            sum += num % 10;
            num /=10;
        }
        System.out.println("The sum of "+ totoalunit + " is "+ sum + ".");
    }
}
class Phone extends Device{
    String Operating;
    Phone(String brand,int totoalunit,String Operating){
        super(brand, totoalunit);
        this.Operating = Operating;
    }
    void display(){
        System.out.println("Phone information: ");
        super.display();
        System.out.println("Operating System: "+ Operating);
    }
}
class Laptop extends Device{
    String screensize;
    Laptop(String brand,int totoalunit,String screensize){
        super(brand,totoalunit);
        this.screensize = screensize;
    }
    void display(){
        System.out.println("Laptop information: ");
        super.display();
        System.out.println("Screen size: "+ screensize);
    }
}
public class task05 {
    public static void main(String[] args) {
        Phone ph = new Phone("Apple",150,"ios");
        Laptop lp = new Laptop("Dell", 125, "14.5 inches");
        ph.display();
        ph.sumofdigit();
        System.out.println();
        lp.display();
        lp.sumofdigit();

    }
}
