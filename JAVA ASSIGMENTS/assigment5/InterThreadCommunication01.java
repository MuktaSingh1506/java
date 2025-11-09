package assigment5;

class SharedResource {
    private boolean dataAvailable = false;

    synchronized void produce() {
        System.out.println("Producer thread started...");
        try {
            System.out.println("Producer is producing data...");
            Thread.sleep(1000);  
            dataAvailable = true;
            System.out.println("Data produced! Notifying consumer...");
            notify(); 
        } catch (InterruptedException e) {
            System.out.println("Producer interrupted.");
        }
    }

    synchronized void consume() {
        System.out.println("Consumer thread started...");
        try {
            while (!dataAvailable) {
                System.out.println("No data yet... waiting for producer.");
                wait(); 
            }
            System.out.println("Data consumed successfully!");
        } catch (InterruptedException e) {
            System.out.println("Consumer interrupted.");
        }
    }
}

public class InterThreadCommunication01{
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread producer = new Thread(() -> resource.produce());

        Thread consumer = new Thread(() -> resource.consume());

        consumer.start(); 
        producer.start(); 
    }
}
