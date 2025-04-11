
abstract class Movie {
    private String title;
    private String director;
    private int releaseYear;

    public Movie(String title, String director, int releaseYear) {
        this.title = title;
        this.director = director;
        this.releaseYear = releaseYear;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public abstract void displayMovieInfo();
}

class ActionMovie extends Movie {
    public ActionMovie(String title, String director, int releaseYear) {
        super(title, director, releaseYear);
    }

    @Override
    public void displayMovieInfo() {
        System.out.println("Genre: Action");
        System.out.println("Title: " + getTitle());
        System.out.println("Director: " + getDirector());
        System.out.println("Release Year: " + getReleaseYear());
    }
}

class ComedyMovie extends Movie {
    public ComedyMovie(String title, String director, int releaseYear) {
        super(title, director, releaseYear);
    }

    @Override
    public void displayMovieInfo() {
        System.out.println("Genre: Comedy");
        System.out.println("Title: " + getTitle());
        System.out.println("Director: " + getDirector());
        System.out.println("Release Year: " + getReleaseYear());
    }
}

public class task10 {
    public static void main(String[] args) {
        Movie movie1 = new ActionMovie("Mission Impossible", "Christopher McQuarrie", 2023);
        Movie movie2 = new ComedyMovie("The Mask", "Chuck Russell", 1994);

        System.out.println("=== Movie 1 ===");
        movie1.displayMovieInfo();

        System.out.println("\n=== Movie 2 ===");
        movie2.displayMovieInfo();
    }
}
