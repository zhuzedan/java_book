package computer;

class Producer implements Runnable {
    private final Computer computer;

    public Producer(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void run() {
        try {
            while (true) {
                computer.produce();
                Thread.sleep(1000); // 模拟生产时间
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("生产者线程中断");
        }
    }
}