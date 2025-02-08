package philosopher;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
    public static void main(String[] args) throws InterruptedException{
        int ponder = 5;
        int size = 5; // 筷子数量
        ExecutorService exec = Executors.newCachedThreadPool();
        Chopstick[] stick = new Chopstick[size];

        for(int i = 0; i < size; i++) {
            stick[i] = new Chopstick();
        }
        for(int i = 0; i < size; i++) {
            Philosopher p = new Philosopher(stick[i], stick[(i+1)%size], i, ponder);
            exec.execute(p);
        }
    }
}
