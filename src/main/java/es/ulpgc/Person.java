package es.ulpgc;

import java.time.LocalDate;
import java.util.StringJoiner;

public class Person {
    private final String name;
    private final LocalDate birthday;

    public Person(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }


    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }


    public short CalcularEdad(){
        return (short) (LocalDate.now().getYear() - birthday.getYear());
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Person.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("birthday=" + birthday)
                .add("age=" + CalcularEdad())
                .toString();
    }
}
