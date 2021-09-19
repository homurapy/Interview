package l3;

public class Printer {
    public static String message = "Ping";
    public static Object lock = new Object();

    static class Executor implements Runnable {
        private String current;
        private String next;

        public Executor(String current, String next) {
            this.current = current;
            this.next = next;
        }

        @Override
        public void run() {
            synchronized (lock) {
                while (true){
                    try {
                        while (message != current) {
                            lock.wait();
                        }

                        System.out.print(current);
                        message = next;

                        Thread.sleep(1000);

                        lock.notifyAll();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
