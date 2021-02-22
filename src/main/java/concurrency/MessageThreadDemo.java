package concurrency;

import java.util.Scanner;

public class MessageThreadDemo {

    public static void main(String[] args) throws InterruptedException {

        MessageThread thread = new MessageThread();
        System.out.println("Running thread");
        thread.start();
        System.out.println("Thread started");

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String command = scanner.nextLine();
            if ("q".equals(command)) {
                System.out.println("You want to leave, but first we have to end thread");
                thread.interrupt();
            }
            Thread.sleep(100);
            if(!thread.isAlive()) {
                System.out.println("Thread ended already");
                return;
            }
        }
    }

}
