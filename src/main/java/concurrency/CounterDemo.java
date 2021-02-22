package concurrency;

public class CounterDemo {

    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();
        CounterThread p1 = new CounterThread(counter);
        CounterThread p2 = new CounterThread(counter);
        CounterThread p3 = new CounterThread(counter);

        p1.start();
        p2.start();
        p3.start();
        Thread.sleep(5000);
        p1.interrupt();
        p2.interrupt();
        p3.interrupt();
        Thread.sleep(1);

        System.out.println("Global counter " + counter.getCount());
        System.out.println("Global counters sum " + (p1.getLocalCounter() + p2.getLocalCounter() + p3.getLocalCounter()));

    }

}
