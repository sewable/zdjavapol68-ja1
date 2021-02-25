package homework.task15;

import java.io.File;

public class Task15BThread2 extends Thread {

    final String url = "https://developer.android.com/studio/images/write/desugar_diagram.png";

    @Override
    public void run() {
        while (!this.isInterrupted()) {
            File file = new File(url);
            System.out.println("Download 2 started");
            Task15B.download(url, "C:\\Users\\sewab\\Desktop\\Programowanie\\Projekty\\Java zaawansowana\\data" + file.getName());
            System.out.println("File 2 downloaded");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                this.interrupt();
            }
        }
    }
}
