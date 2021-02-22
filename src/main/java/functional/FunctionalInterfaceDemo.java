package functional;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class Person {
    final String name;
    final int point;

    public Person(String name, int point) {
        this.name = name;
        this.point = point;
    }

    public String getName() {
        return name;
    }

    public int getPoint() {
        return point;
    }
}

public class FunctionalInterfaceDemo {

    public static void main(String[] args) {
        //PREDICATE
        //definiujemy predykat, p jest tylko parametrem metody
        Predicate<Person> isPointGreaterThan10 = p -> p.getPoint() > 10;
        Person person = new Person("MIKE", 34);
        if(person.getPoint() > 10) {
            System.out.println("OK");
        }

        Predicate<Person> filter = isPointGreaterThan10;
        //wywołujemy predykat, podajemy argument, konkretny obiekt
        if(filter.test(person)) {
            System.out.println("OK");
        }

        filter = p -> p.getName().contains("I");
        if(filter.test(person)) {
            System.out.println("OK");
        }

        //SUPPLIER
        Supplier<Person> createPerson = () -> new Person("SULLY", 3);

        //CONSUMER
        Consumer<Person> print = p -> System.out.println("Name: " + p.getName() + ", points: " + p.getPoint());
        print.accept(person);

        //FUNCTION
        Function<Person, Integer> points = p -> p.getPoint() * 10;
        System.out.println(points.apply(person));

    }

}
