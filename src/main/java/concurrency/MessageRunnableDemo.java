package concurrency;

public class MessageRunnableDemo {

    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(new MessageRunnable());
        Thread thread1 = new Thread(new MessageRunnable(100));
        thread.start();
        while (!thread.isAlive()) { //ta pętla powoduje czekanie, aż wątek się uruchomi
        }
        thread1.start();
        Thread.sleep(5000);
        thread.interrupt();
        thread1.interrupt();

    }

}
