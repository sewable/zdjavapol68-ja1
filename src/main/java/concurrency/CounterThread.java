package concurrency;

import java.util.Random;

public class CounterThread extends Thread {

    final Counter counter;
    private int localCounter;

    public CounterThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        Random random = new Random();
        int count = 10;
        while (!this.isInterrupted() && count-- > 0) {
//            synchronized (counter) {//synchronizacja na wspólnym obiekcie za pomocą bloku synchronized
//                counter.inc();      //sekcja krytyczna, bo odwołujemy się do wspólnego obiektu dla wszystkich wątków
//            }
            counter.inc(); //nie musimy umieszczać w bloku synchronized, bo ta metoda jest synchronizowana na swoim obiekcie (w klasie Counter)
            localCounter++;
            try {
                Thread.sleep(random.nextInt(100));
            } catch (InterruptedException e) {
                System.out.println("Thread interruption");
                this.interrupt();
            }
        }
        System.out.println("END OF THREAD");
    }

    public int getLocalCounter() {
        return localCounter;
    }
}
