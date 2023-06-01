class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}

class MyThread extends Thread {
    public void run() {
        for (int i = 6; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}

public class Multithreading {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread t1 = new Thread(myRunnable, "Thread 1");
        Thread t2 = new Thread(myRunnable, "Thread 2");
        MyThread myThread = new MyThread();
        t1.start();
        t2.start();
        myThread.start();
    }
}
