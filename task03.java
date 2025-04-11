import java.util.Scanner;

public class task03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        sc.close();
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.print(i + ",");
            }
        }
    }
}
