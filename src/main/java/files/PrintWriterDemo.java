package files;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class PrintWriterDemo {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("MIKE", "SULLY", "RANDALL");
        //PrintWriter - dekorator strumienia wyjściowego znakowego
        //FileWriter - konkretna klasa strumienia wyjściowego skojarzonego z plikiem
        try (PrintWriter printer = new PrintWriter(new FileWriter("C:\\Users\\sewab\\Desktop\\Programowanie\\Projekty\\Java zaawansowana\\data\\names.txt"))){
            for(String name : names) {
                printer.println(name);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
