class FirstThread extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("FirstThread: " + i);
        }
    }

    public void printSecondPart() {
        for (int i = 21; i <= 30; i++) {
            System.out.println("FirstThread: " + i);
        }
    }
}

class SecondThread extends Thread {
    public void run() {
        for (int i = 11; i <= 20; i++) {
            System.out.println("SecondThread: " + i);
        }
    }
}

public class task06 {
    public static void main(String[] args) {
        FirstThread t1 = new FirstThread();
        SecondThread t2 = new SecondThread();

        try {
            t1.start();
            t1.join();
            t2.start();
            t2.join();
            t1.printSecondPart();

        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }
    }
}
