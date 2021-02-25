package homework.task15;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class RequestConsumer implements Runnable {

    final private  int maxTime;
    final private BlockingQueue<String> requests;

    public RequestConsumer(int maxTime, BlockingQueue<String> requests) {
        this.maxTime = maxTime;
        this.requests = requests;
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                Thread.sleep(maxTime);
                int request = Integer.parseInt(requests.element(), 29);
                System.out.println("Request " + requests.element() + " = " + request);
            } catch (InterruptedException e) {
                System.out.println("CONSUMER STOPPED");
                Thread.currentThread().interrupt();
            }
        }
    }
}
