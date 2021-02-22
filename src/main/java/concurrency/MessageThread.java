package concurrency;

public class MessageThread extends Thread {

    @Override
    public void run() {
        while (!this.isInterrupted()) {
            //tutaj własny kod wykonywany w każdej pętli wątku
            System.out.println("Current temperature: " + 100);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println("Thread interruption");
                this.interrupt();
            }
        }
        System.out.println("END OF THREAD");
    }
}
