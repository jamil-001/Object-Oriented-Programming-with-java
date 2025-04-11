class Product{
    String name;
    double price;
    String category;
    Product(String name,double price,String category){
        this.name = name;
        this.price = price;
        this.category = category;
    }
    void display(){
        System.out.println("Product name: " + name);
        System.out.println("Product price: " + price );
        System.out.println("Product category: " + category);
    }
}
public class task09 {
    public static void main(String[] args) {
        Product obj = new Product("Rice", 2000.0, "food");
        obj.display();
    }
}
