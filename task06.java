
public class task06{
    public static void main(String[] args) {
        int n = 25;
        long a = 0,b = 1,c = 0;
        for(int i = 2;i <= n;i++){
            c = a+b;
            a = b;
            b = c;
        }
        System.out.println("the 25th fibo number is: " + c);
    }
}
