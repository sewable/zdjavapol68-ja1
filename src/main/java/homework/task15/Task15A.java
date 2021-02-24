package homework.task15;

import java.util.Scanner;

/**
 * Napisz program, który co 5 sekund wyświetla komunikat "Hello" do czasu naciśnięcia klawisza Q przez użytkownika
 */
public class Task15A {

    public static void main(String[] args) throws InterruptedException {

        Task15AThread thread = new Task15AThread();
        thread.start();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String command = scanner.nextLine();
            if("q".equals(command.toLowerCase())) {
                System.out.println("Thread interrupted");
                thread.interrupt();
            }

            Thread.sleep(10);
            if(!thread.isAlive()) {
                System.out.println("Thread already ended");
                return;
            }
        }

    }
}