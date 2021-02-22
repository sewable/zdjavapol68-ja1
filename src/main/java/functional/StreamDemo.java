package functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

interface Transform {
    String apply(String arg);
}

public class StreamDemo {

    static public List<String> toLowerCase(List<String> list) {
        List<String> result = new ArrayList<>();
        for(String s : list) {
            result.add(s.toLowerCase());
        }
        return result;
    }

    static public List<String> transform(List<String> list, Transform trans) {
        List<String> result = new ArrayList<>();
        for(String s : list) {
            result.add(trans.apply(s));
        }
        return result;
    }

    public static void main(String[] args) {

        List<String> names = Arrays.asList("MIKE", "SULLY", "RANDALL");
        System.out.println(toLowerCase(names));
        System.out.println(transform(names, s -> s.toLowerCase()));
        System.out.println(transform(names, s -> "Imię: " + s));

        Consumer<String> consumer = name -> System.out.print(name + ", ");
        names.stream().filter(name -> name.contains("L")).forEach(consumer);
        System.out.println("\b\b");

        Function<String, String> toLowerCase = name -> name.toLowerCase();
        final List<String> collect = names.stream().map(toLowerCase).collect(Collectors.toList());
        System.out.println(collect);

    }

}
