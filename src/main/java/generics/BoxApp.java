package generics;

public class BoxApp {

    public static void main(String[] args) {

        Box<String> stringBox = new Box<>("TEST", 5.2);
        System.out.println(stringBox.getContent());
        Box<Integer> intigerBox = new Box<>(125, 5.2);
        System.out.println(intigerBox.getContent());
        Box<Person> personBox = new Box<>(new Person("Mike", 182), 84);
        System.out.println(personBox.getContent());
        //do pudełka generycznego typu bazowego (Person) można dodać typ pochodny (User)
        personBox = new Box<>(new User("Mike", 182, "Mike@elo.com"), 84);
        System.out.println(personBox.getContent());
        // do pudełka na obiekty typu interfejsu możemy dodawać dowolne obiekty
        //implementujące ten interfejs
        Box<Boxable> universalBox = new Box<>(new User("Mike", 165.5, "aa@gmail.com"), 87);
        universalBox = new Box<>(new StringBoxable("TEST"), 21);

    }

}
