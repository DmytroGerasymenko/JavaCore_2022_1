package HW3_3;

import java.util.ArrayList;

public class HW3_3 {
    public static void main(String[] args) {
        int numberOfPersons = 5;

        ArrayList<Person> persons = new ArrayList<>();
        for (int i = 0; i < numberOfPersons; i++) {
            persons.add(Person.input(i + 1));
        }

        System.out.println();
        for (Person person: persons) {
            person.output();
        }
    }
}
