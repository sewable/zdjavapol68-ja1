package collections;

import java.time.LocalDate;
import java.util.*;

class PersonComparatorByHeight implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        System.out.println("compare called");
        return Integer.compare(o1.height, o2.height);
//        if (o1.height == o2.height) return 0;
//        if (o1.height > o2.height) return 1;
//        return -1;
    }
}

class Person {

    final String name;
    final LocalDate birthDate;
    final int height;

    public Person(String name, LocalDate birthDate, int height) {
        this.name = name;
        this.birthDate = birthDate;
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("equals called");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return height == person.height && Objects.equals(name, person.name) && Objects.equals(birthDate, person.birthDate);
    }

    @Override
    public int hashCode() {
        System.out.println("hashCode called");
        return Objects.hash(name, birthDate, height);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", height=" + height +
                '}';
    }
}

class Email {

    final String username;
    final String host;

    public Email(String username, String host) {
        this.username = username;
        this.host = host;
    }

    //w obu metodach trzeba korzystać z tych samych pól
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Email email = (Email) o;
        return Objects.equals(username, email.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, host);
        //TAK NIE WOLNO! Jeśli w equals korzystamy tylko z username to w hashCode też tylko z username!
        //(tutaj bez hosta)
    }
}

public class PersonSetDemo {

    public static void main(String[] args) {

        Set<Person> persons = new LinkedHashSet<>();
        persons.add(new Person("Mike", LocalDate.of(1994, 06, 02), 55));
        persons.add(new Person("Sully", LocalDate.of(1991, 02, 21), 213));
        persons.add(new Person("Randall", LocalDate.of(1993, 10, 12), 174));
        //dwa indentyczne hashe nie oznaczają, że obiekty są identyczne, mogą być różne
        //dwa różne hashe oznaczają, że na pewno obiety są różne
        //dodanie drugi raz tego samego elementu do zbioru powoduje:
        //- wywołanie hashCode dla elementu
        //- jeśli w zbiorze jest już taki sam hashCode to wywołane jest equals dla obu obiektów, jeśli są
        //  równe to element nie jest dodawany
        persons.add(new Person("Mike", LocalDate.of(1994, 06, 02), 55));
        System.out.println(persons);

        Set<Person> sortedPersons = new TreeSet<>(new PersonComparatorByHeight());
        sortedPersons.add(new Person("Mike", LocalDate.of(1994, 06, 02), 55));
        sortedPersons.add(new Person("Sully", LocalDate.of(1991, 02, 21), 213));
        sortedPersons.add(new Person("Randall", LocalDate.of(1993, 10, 12), 174));
        for(Person person : sortedPersons){
            System.out.println(person);
        }
    }

}
