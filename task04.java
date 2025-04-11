class PrimeThread extends Thread {
    private int start;
    private int end;
    public PrimeThread(int start, int end) {
        this.start = start;
        this.end = end;
    }
    private boolean isPrime(int number) {
        if (number <= 1) return false;
        if (number == 2) return true;
        if (number % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.println("Prime from " + Thread.currentThread().getName() + ": " + i);
            }
        }
    }
}

public class task04 {
    public static void main(String[] args) {
        int rangeStart = 1;
        int rangeEnd = 100000;
        int numThreads = 5;
        int rangePerThread = (rangeEnd - rangeStart + 1) / numThreads;

        for (int i = 0; i < numThreads; i++) {
            int start = rangeStart + (i * rangePerThread);
            int end = (i == numThreads - 1) ? rangeEnd : start + rangePerThread - 1;

            PrimeThread thread = new PrimeThread(start, end);
            thread.setName("Thread-" + (i + 1));
            thread.start();
        }
    }
}
