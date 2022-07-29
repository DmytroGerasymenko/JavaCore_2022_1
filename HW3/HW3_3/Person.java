package HW3_3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getAge() {
        LocalDate date = LocalDate.now();
        return date.getYear() - birthYear;
    }

    public void output() {
        System.out.printf("First Name: %s; Last Name: %s; Year of Birth: %d; Age: %d\n",
                this.getFirstName(), this.getLastName(), this.getBirthYear(), this.getAge());
    }

    public void changeName(String fn, String ln) {
        this.setFirstName(fn);
        this.setLastName(ln);
    }

    static Person input(int numberOfPerson) {
        Scanner scan = new Scanner(System.in);
        Person prsn = new Person();
        System.out.printf("Please enter a First Name of the Person %s: ", numberOfPerson);
        prsn.setFirstName(scan.next());
        System.out.printf("Please enter a Last Name of the Person %s: ", numberOfPerson);
        prsn.setLastName(scan.next());
        System.out.printf("Please enter a Year of Birth of the Person %d: ", numberOfPerson);
        prsn.setBirthYear(scan.nextInt());
        return prsn;
    }
}
