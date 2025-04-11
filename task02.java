public class task02 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        try {
            System.out.println("Accessing element at index 10: " + numbers[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index is out of bounds!");
        }

        System.out.println("Program continues after exception handling.");
    }
}
