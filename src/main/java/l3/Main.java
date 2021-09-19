package l3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    /**
     * Print out line "ABC ABC ABC"
     */
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        executorService.submit(new Printer.Executor("Ping", "Pong"));
        executorService.submit(new Printer.Executor("Pong", "Ping"));
        executorService.shutdown();


    }
}
