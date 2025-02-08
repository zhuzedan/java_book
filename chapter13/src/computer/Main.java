package computer;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();

        Thread producerThread = new Thread(new Producer(computer), "Producer");
        Thread consumerThread = new Thread(new Consumer(computer), "Consumer");

        producerThread.start();
        consumerThread.start();
    }
}