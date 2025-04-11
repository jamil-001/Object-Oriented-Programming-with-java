class Book{//class
    String title;//attribute
    int year;
    String author;
    Book(String title,int year,String author){//constructor
        this.title = title;
        this.year = year;
        this.author = author;
    }
    void display(){//method
        System.out.println("Book title: " + title);
        System.out.println("Year: " + year);
        System.out.println("author: " + author);
    }
}
public class task08 {
    public static void main(String[] args) {
        Book obj = new Book("OOP",2025,"jamil ahmed");//Object of book class
        obj.display();
    }
}
