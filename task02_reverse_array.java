import java.util.Scanner;
public class task02_reverse_array {
    public static void main(String[] args) {
         // int [] originalArray = {5,3,9,2,1,7};
         Scanner sc = new Scanner(System.in);
         //array size from user:
         int size = sc.nextInt();
         int [] originalArray = new int[size];
 
         //array input from user
         for(int i=0;i<size;i++){
             originalArray[i] = sc.nextInt();
         }
         int [] reversArray = new int[originalArray.length];
         //reverse from original
         for(int i=0;i<originalArray.length;i++){
             reversArray[i] = originalArray[originalArray.length - 1 -i];//length - 1 -i
         }
        
         System.out.println("Original array is: ");
         for(int num : originalArray){
             System.out.print(num + " ");
         }
 
         System.out.println();
         System.out.println("Reverse Array: ");
         for(int num : reversArray){
             System.out.print(num + " ");
         }
         sc.close();
 
    }
}
