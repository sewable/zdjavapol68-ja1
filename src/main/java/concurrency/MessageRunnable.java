package concurrency;

public class MessageRunnable implements Runnable {

    final long time;

    public MessageRunnable() {
        this.time = 1000;
    }

    public MessageRunnable(long time) {
        this.time = time;
    }

    @Override
    public void run() {
        int count = 10;
        while (!Thread.currentThread().isInterrupted() && count-- > 0) {
            //tutaj własny kod wykonywany w każdej pętli wątku
            System.out.println("Current temperature: " + 100 + " " + Thread.currentThread().getName());
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                System.out.println("Thread interruption");
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("END OF THREAD");
    }
}
