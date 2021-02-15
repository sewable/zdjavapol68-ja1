package collections;

import java.time.LocalDate;
import java.util.*;

public class HashMapDemo {

    public static void main(String[] args) {

        Map<String, Integer> emailStats = new HashMap<>();
        //automatyczne zapakowanie wartości typu int do typu Integer
        emailStats.put("elo@gmail.com", 10);
        emailStats.put("gazelo@gmail.com", 576);
        emailStats.put("haha@gmail.com", 1246);
        //niestety można dodać parę null, null
        emailStats.put(null, null);

        //null check
        if (null != emailStats.get("gazel@gmail.com")) {
            //automatyczne rozpakowanie z typu Integer do typu prostego int
            int result = emailStats.get("gazel@gmail.com");
            System.out.println(result);
        } else {
            System.out.println("There is no such key");
        }

        System.out.println(emailStats.keySet());
        //iterowanie po mapie przy pomocy Entry i entrySet
        for(Map.Entry<String, Integer> entry : emailStats.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        System.out.println(emailStats.containsKey("elo@gmail.com"));
        System.out.println(emailStats.containsValue(576));

        emailStats.remove(null);
        //w TreeMap nie może być null!
        Map<String, Integer> copy = new TreeMap<>(emailStats);
        System.out.println(copy);

        //mapa osób pod kluczem imię
        Map<String, List<Person>> personsMap = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        });
        //zanim dodamy konkretną osobę o imieniu,  musimy utworzyć kolekcję na obiekty pod tym kluczem
        personsMap.put("Mike", new ArrayList<>());
        //pobieramy kolekcję z pod klucza
        List<Person> list = personsMap.get("Mike");
        //dodajemy do kolekcji pod kluczem
        list.add(new Person("Mike", LocalDate.of(1991, 10, 02), 126));
        personsMap.get("Mike").add(new Person("Mike", LocalDate.of(1991, 10, 02), 126));
        System.out.println(personsMap);
    }

}
