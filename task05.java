class SumThread extends Thread {
    private int start;
    private int end;
    private long partialSum;

    public SumThread(int start, int end) {
        this.start = start;
        this.end = end;
        this.partialSum = 0;
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            partialSum += i;
        }
    }

    public long getPartialSum() {
        return partialSum;
    }
}

public class task05 {
    public static void main(String[] args) {
        int totalNumbers = 50000;
        int numThreads = 5;
        int rangePerThread = totalNumbers / numThreads;

        SumThread[] threads = new SumThread[numThreads];

        for (int i = 0; i < numThreads; i++) {
            int start = i * rangePerThread + 1;
            int end = (i == numThreads - 1) ? totalNumbers : start + rangePerThread - 1;

            threads[i] = new SumThread(start, end);
            threads[i].start();
        }
        long totalSum = 0;
        try {
            for (int i = 0; i < numThreads; i++) {
                threads[i].join();
                totalSum += threads[i].getPartialSum();
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }

        System.out.println("Total Sum from 1 to 50000: " + totalSum);
    }
}
