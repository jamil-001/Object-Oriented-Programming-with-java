import java.util.Scanner;
import java.util.InputMismatchException;

public class task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();
            System.out.println("You entered: " + number);
        } catch (InputMismatchException e) {
            System.out.println("Error: That is not a valid integer!");
        } finally {
            scanner.close();
            System.out.println("Program finished.");
        }
    }
}
