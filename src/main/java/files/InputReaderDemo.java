package files;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class InputReaderDemo {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\sewab\\Desktop\\Programowanie\\Projekty\\Java zaawansowana\\data\\data.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                names.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String name : names) {
            System.out.print(name + ", ");
        }
        System.out.println("\b\b");
    }

}
