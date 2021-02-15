package collections;

import java.util.*;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>(Arrays.asList("MIKE", "SULLY", "RANDALL"));

        names.addFirst("BU");
        names.addLast("CHUDY");
        System.out.println(names);
        System.out.println(names.element());

        //zmiana typu referencji z LinkedList na typ List
        List<String> namesAsLiast = names;

        System.out.println(names instanceof Iterable);
        System.out.println(names instanceof Collection);
        System.out.println(names instanceof List);

        ListIterator<String> iterator = names.listIterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            if(item.length() == 5) {
                iterator.remove();
            } else {
                if(item.startsWith("M")){
                    iterator.add("OK");
                }
            }
        }
        System.out.println(names);

        while (iterator.hasPrevious()) {
            String item = iterator.previous();
            System.out.println("item[" + (iterator.previousIndex() + 1) + "]: " + item);
        }
    }

}
