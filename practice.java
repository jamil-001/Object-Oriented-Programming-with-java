class Shape{
      double l,w,r;
      Shape(double l,double w){
        this.l = l ;
        this.w = w;
      }
      Shape(double r){
        this.r = r;
      }
}
class Circle extends Shape{
      Circle(double r){
      super(r);
      }
      void displayType(){
        System.out.println("Type of Shape circle");
      }
}
class Rectangle extends Shape{
     Rectangle(double l,double w){
      super(l, w);
     }
     void displayType(){
      System.out.println("Type of shape rectangle");
     }
}
public class practice {

    public static void main(String[] args) {
      Circle circle = new Circle(5.0);
 Rectangle rectangle = new Rectangle(4.0, 6.0);
 circle.displayType();
 rectangle.displayType();

     
    }
}