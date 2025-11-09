package assignment4;

public class myRunnable09 implements Runnable {
    public void run() {
        System.out.println("Thread is running using runnable: "+ Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread t = new Thread(new myRunnable09());
        t.start();
    }
}
