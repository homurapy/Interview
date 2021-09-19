package l3;

public class MainLock {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 10; j++) {
                        counter.increment();
                    }
                }
            }).start();
        }
        Thread.sleep(2000);
        System.out.println(counter.getCount());
    }
}

