package es.ulpgc;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person juan = new Person("juan", LocalDate.of(1997,8,6));
        System.out.println(juan);
    }
}