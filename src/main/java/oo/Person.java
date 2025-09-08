package oo;

import java.util.Objects;

public class Person {
    private Integer id;
    private int age;
    private String name;

    public Person(int id,String name, int age) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public String introduce() {
        return String.format("My name is %s. I am %d years old.", name, age);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(id, person.id) && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, age, name);
    }
}
