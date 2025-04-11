import java.util.Scanner;
public class task04 {
    public static void main(String[] args) {
        int flag = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number ");
        int number = sc.nextInt();
        sc.close();
        if(number == 1 || number == 0){
            System.out.println(number + " isn't prime number ");
        }else{
            for(int i=2;i<number;i++){
                if(number % i == 0){
                    System.out.println(number + " isn't prime number ");
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                System.out.println(number + " is prime number ");
            }
        }
    }
}
