package homework.task15;

import java.io.File;

public class Task15BThread4 extends Thread {

    final String url = "https://static01.helion.com.pl/global/okladki/326x466/javp11.jpg";

    @Override
    public void run() {
        while (!this.isInterrupted()) {
            File file = new File(url);
            System.out.println("Download 4 started");
            Task15B.download(url, "C:\\Users\\sewab\\Desktop\\Programowanie\\Projekty\\Java zaawansowana\\data" + file.getName());
            System.out.println("File 4 downloaded");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                this.interrupt();
            }
        }
    }
}
