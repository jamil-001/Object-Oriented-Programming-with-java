import java.util.Scanner;

public class task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the first number (numerator): ");
            int numerator = scanner.nextInt();

            System.out.print("Enter the second number (denominator): ");
            int denominator = scanner.nextInt();

            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {

            System.out.println("Error: Cannot divide by zero.");
        } finally {
            scanner.close();
            System.out.println("Program ended.");
        }
    }
}
