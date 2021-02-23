package homework.task14;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Napisz program, który obsługuje książkę adresową zapisywaną w pliku.
 * Format pliku jest binarny, a zapisywane są serializowane obiekty klasy
 * AddressItem. Dodaj do tej klasy odpowiedni interfejs, który umożliwia serializację.
 * Program powinien umożliwiać:
 * - dodanie nowego adresu
 * - usunięcie adresu
 * - wyświetlenie całej zawartości
 * - wyszukanie na podstawie pola name lub phoneNumber adresu lub adresów (dla pola name)
 */
public class Task14B {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        AddressItem firstAddress = new AddressItem("Mike", "Mike Wazowski", "wazowski@gmail.com", "123123123", LocalDate.of(1990, 03, 05));
        AddressItem secondAddress = new AddressItem("Sully", "Sully Sullivan", "sully@gmail.com", "123456789", LocalDate.of(1991, 10, 12));
        AddressItem thirdAddress = new AddressItem("Randall", "Randall Bigot", "randall@gmail.com", "123789456", LocalDate.of(1991, 12, 30));

        List<AddressItem> list = new ArrayList<>();
        list.add(firstAddress);
        list.add(secondAddress);
        list.add(thirdAddress);

        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("C:\\Users\\sewab\\Desktop\\Programowanie\\Projekty\\Java zaawansowana\\zdjavapol68-ja1\\src\\main\\resources\\task14B.txt"))) {
            output.writeObject(list);
            list.remove(thirdAddress);
            output.writeObject(list);
        }

        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream("C:\\Users\\sewab\\Desktop\\Programowanie\\Projekty\\Java zaawansowana\\zdjavapol68-ja1\\src\\main\\resources\\task14B.txt"))) {
            input.readObject();
            System.out.println(list);
        }
    }
}