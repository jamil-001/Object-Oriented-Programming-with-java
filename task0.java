class DivisorThread extends Thread {
    private int start;
    private int end;
    private int numberWithMaxDivisors;
    private int maxDivisors;

    public DivisorThread(int start, int end) {
        this.start = start;
        this.end = end;
        this.numberWithMaxDivisors = start;
        this.maxDivisors = 1;
    }

    private int countDivisors(int n) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                count += (i == n / i) ? 1 : 2;
            }
        }
        return count;
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            int divisors = countDivisors(i);
            if (divisors > maxDivisors) {
                maxDivisors = divisors;
                numberWithMaxDivisors = i;
            }
        }
    }

    public int getNumberWithMaxDivisors() {
        return numberWithMaxDivisors;
    }

    public int getMaxDivisors() {
        return maxDivisors;
    }
}
public class task0 {
    public static void main(String[] args) {
        int totalRange = 100000;
        int threadsCount = 10;
        int rangePerThread = totalRange / threadsCount;

        DivisorThread[] threads = new DivisorThread[threadsCount];

        for (int i = 0; i < threadsCount; i++) {
            int start = i * rangePerThread + 1;
            int end = (i == threadsCount - 1) ? totalRange : (start + rangePerThread - 1);
            threads[i] = new DivisorThread(start, end);
            threads[i].start();
        }
        int globalMaxDivisors = 0;
        int globalNumber = 1;

        try {
            for (int i = 0; i < threadsCount; i++) {
                threads[i].join();
                if (threads[i].getMaxDivisors() > globalMaxDivisors) {
                    globalMaxDivisors = threads[i].getMaxDivisors();
                    globalNumber = threads[i].getNumberWithMaxDivisors();
                }
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }
        System.out.println("Number with the most divisors: " + globalNumber);
        System.out.println("Number of divisors: " + globalMaxDivisors);
    }
}
