package homework.task1;

import java.time.LocalDate;

public class PersonPrint extends Person {

    public PersonPrint(String name, LocalDate birthDate) {
        super(name, birthDate);
    }

    @Override
    public String toString() {
        return "Bohater " + name +
                " urodzony w " + birthDate;
    }
}
