package files;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {

    public static void main(String[] args) throws IOException {

        FileInputStream inputStream = new FileInputStream("C:\\Users\\sewab\\Desktop\\Programowanie\\Projekty\\Java zaawansowana\\data\\data.txt");
        int bajt;
        while ((bajt = inputStream.read()) != -1) {
            System.out.println("Byte: " + bajt + " char: " + (char)bajt);
        }
        inputStream.close();

    }

}
