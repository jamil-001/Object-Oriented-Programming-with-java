
class CatalogItem {
    private String title;
    private String author;
    private int year;

    public CatalogItem(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
    }
}

class Book extends CatalogItem {
    private String genre;

    public Book(String title, String author, int year, String genre) {
        super(title, author, year);
        this.genre = genre;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Genre: " + genre);
    }
}

class DVD extends CatalogItem {
    private int duration; 

    public DVD(String title, String author, int year, int duration) {
        super(title, author, year);
        this.duration = duration;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Duration: " + duration + " minutes");
    }
}

public class task05 {
    public static void main(String[] args) {
        CatalogItem book = new Book("Effective Java", "Joshua Bloch", 2018, "Programming");
        CatalogItem dvd = new DVD("Inception", "Christopher Nolan", 2010, 148);

        System.out.println("=== Book Details ===");
        book.displayDetails();

        System.out.println("\n=== DVD Details ===");
        dvd.displayDetails();
    }
}
