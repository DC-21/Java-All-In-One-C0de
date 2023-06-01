class MyThread extends Thread implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread: " + Thread.currentThread().getId() + ", Count: " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Create two threads
        Thread thread1 = new MyThread();
        Thread thread2 = new MyThread();

        // Start the threads
        thread1.start();
        thread2.start();
    }
}
