package homework.task15;

import java.io.File;

public class Task15BThread1 extends Thread {

    final String url = "https://stormit.pl/wp-content/uploads/java-historia.png";

    @Override
    public void run() {
        while (!this.isInterrupted()) {
            File file = new File(url);
            System.out.println("Download 1 started");
            Task15B.download(url, "C:\\Users\\sewab\\Desktop\\Programowanie\\Projekty\\Java zaawansowana\\data" + file.getName());
            System.out.println("File 1 downloaded");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
