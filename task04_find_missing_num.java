
public class task04_find_missing_num {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,6};
        int n = arr.length + 1;
        int expetedsum = n * (n + 1) / 2;
        int actualsum = 0;
        for(int num : arr){
            actualsum += num ;
        }
        int missingnum  = expetedsum - actualsum;
        System.out.println("missing number: " + missingnum);
    }
}
