package collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetDemo {

    public static void main(String[] args) {

        Set<String> names = new HashSet<>(Arrays.asList("MIKE", "SULLY", "RANDALL"));
        names.add("BU");
        System.out.println(names);

        System.out.println(names.contains("MIKE"));
        System.out.println(names.containsAll(Arrays.asList("SULLY", "BU")));

        System.out.println(names.add("MIKE"));
        System.out.println(names);
    }

}
