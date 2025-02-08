package computer;

class Consumer implements Runnable {
    private final Computer computer;

    public Consumer(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void run() {
        try {
            while (true) {
                computer.consume();
                Thread.sleep(1000); // 模拟搬运时间
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("消费者线程中断");
        }
    }
}
