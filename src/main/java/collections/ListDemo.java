package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("MIKE");
        names.addAll(Arrays.asList("MIKE", "SULLY", "RANDALL"));
        System.out.println(names);

        System.out.println(names.get(2));

        names.add(1, "BU");
        System.out.println(names);

        names.remove(0);
        System.out.println(names);

        names.addAll(2, Arrays.asList("CHUDY", "BUZZ", "CIENKI"));
        System.out.println(names);

        List<String> sublist = names.subList(1, 4);
        System.out.println(sublist);
        sublist.add("MUSTANG");
        System.out.println(names);

        List<String> copy = new ArrayList<>(sublist);
        System.out.println(copy);
    }

}
