package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>(Arrays.asList("MIKE", "SULLY", "RANDALL"));
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            //wewnątrz pętli wywołujemy next tylko raz!
            //lub tylko raz po wywołaniu hasNext zwracającym true!
            String item = iterator.next();
            System.out.println(item);
        }

        iterator = names.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            if(item.length() == 5) {
                iterator.remove();
            }
        }

        System.out.println(names);

    }

}
