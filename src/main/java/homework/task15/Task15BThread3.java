package homework.task15;

import java.io.File;

public class Task15BThread3 extends Thread {

    final String url = "https://www.eginnovations.com/blog/wp-content/uploads/2019/06/how-to-troubleshoot-java-cpu.jpg";

    @Override
    public void run() {
        while (!this.isInterrupted()) {
            File file = new File(url);
            System.out.println("Download 3 started");
            Task15B.download(url, "C:\\Users\\sewab\\Desktop\\Programowanie\\Projekty\\Java zaawansowana\\data" + file.getName());
            System.out.println("File 3 downloaded");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
