package homework.task14;

import java.io.*;

/**
 * CZĘŚĆ 1
 * W pliku task14.txt znajduje się tekst. Wczytaj go i policz:
 * - liczbę słów
 * - liczbę wierszy
 * - liczbę słów 4-literowych
 * - liczbę słów, które są liczbami (całkowite lub dziesiętne np. 12, 34,45 itd.)
 *
 * CZĘŚĆ 2
 * Zapisz do pliku out_task14.txt wyniki uzyskane z części 1 plus:
 * - listę słów 4-literowych
 * - listę wszystkich liczb
 * Lokalizację pliku out_task14.txt możesz wybrać dowolną np. w bieżącym katalogu
 */
public class Task14A {
    public static void main(String[] args) throws IOException {
        //W taki sposób tworzymy strumień wejściowy do plików w katalogu resources
        InputStream input = Task14A.class.getResourceAsStream("../../task14.txt");
        //sekwencja ../ powoduje przejście o katalog wyżej
        //dwie sa konieczne ponieważ każdy pakiet to katalog, a mamy pakiet task14 w pakiecie homework
        int bajt;
        int wordcount = 0;
        int versecount = 0;
        int fourLettersWords = 0;
        while ((bajt = input.read()) != -1) {
            System.out.println("Byte: " + bajt + "\tchar: " + (char)bajt);
            if(bajt == 32 || bajt == 10) {
                wordcount++;
            }
            if(bajt == 10) {
                versecount++;
            }

        }
        input.close();

        wordcount++;
        System.out.println("Number of words: " + wordcount);
        versecount++;
        System.out.println("Number of verses: " + versecount);

        File file = new File("C:\\Users\\sewab\\Desktop\\Programowanie\\Projekty\\Java zaawansowana\\zdjavapol68-ja1\\src\\main\\resources\\out_task14.txt");
        try {
            FileOutputStream output = new FileOutputStream(file);

            output.write((byte)wordcount);
            output.write(10);
            output.write((byte)versecount);
        } catch (FileNotFoundException e) {
            System.out.println("There is no such data");
        } catch (IOException e) {
            System.out.println("Error in saving data");
        }
    }
}