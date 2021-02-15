package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionDemo {

    public static void main(String[] args) {

        Collection<String> names = new ArrayList<>();
        names.add("MIKE");
        names.addAll(Arrays.asList("MIKE", "SULLY", "RANDALL"));

        for(String name : names){
            System.out.println(name);
        }

        names.remove("MIKE");
        System.out.println(names);

        String randall = new String("RANDALL");
        names.remove(randall);
        System.out.println(names);

        System.out.println(names.contains("SULLY"));
        System.out.println(names.isEmpty());
        System.out.println(names.size());

        names.clear();
        System.out.println(names);
    }

}
