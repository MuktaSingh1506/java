package assignment4;

public class myThread08 extends Thread {
    public void run() {
        System.out.println("Running thread: " + Thread.currentThread().getName());
        System.out.println("Thread ID: " + Thread.currentThread().threadId());
        System.out.println("Thread Priority: " + Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        myThread08 t1 = new myThread08();
        t1.start();

    }
}
