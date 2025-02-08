package computer;

public class Computer {
    private boolean isProduced = false;

    public synchronized void produce() throws InterruptedException {
        while (isProduced) {
            wait(); // 如果已经有电脑生产出来了，那么生产者线程就需要等待
        }
        System.out.println("生产者生产了一台电脑");
        isProduced = true;
        notify(); // 唤醒等待的搬运线程
    }

    public synchronized void consume() throws InterruptedException {
        while (!isProduced) {
            wait(); // 如果没有电脑生产出来，搬运者线程就需要等待
        }
        System.out.println("搬运者搬走了电脑");
        isProduced = false;
        notify(); // 唤醒等待的生产者线程
    }
}
