package assignment4;

class EvenThread extends Thread {
    public void run() {
        for (int i = 2; i <= 50; i += 2) {
            System.out.println("Even: " + i);
        }
    }
}

class OddThread extends Thread {
    public void run() {
        for (int i = 1; i <= 50; i += 2) {
            System.out.println("Odd: " + i);
        }
    }
}

public class multipleSimultaneousThread10 {
    public static void main(String[] args) {
        new EvenThread().start();
        new OddThread().start();
    }
}