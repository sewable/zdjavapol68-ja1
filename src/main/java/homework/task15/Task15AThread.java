package homework.task15;

public class Task15AThread extends Thread {

    @Override
    public void run() {
        while (!this.isInterrupted()) {
            System.out.println("Hello");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println("Thread interruption");
                this.interrupt();
            }
        }
        System.out.println("END OF THREAD");
    }
}
