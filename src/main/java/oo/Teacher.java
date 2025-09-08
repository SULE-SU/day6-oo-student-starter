package oo;

import java.util.Objects;

public class Teacher extends Person {
    private Integer id;
    private Integer age;
    private String name;

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }
    public String introduce() {
        return String.format("My name is %s. I am %d years old. I am a teacher.", getName(), getAge());
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Teacher teacher = (Teacher) o;
        return age == teacher.age && Objects.equals(id, teacher.id) && Objects.equals(name, teacher.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, age, name);
    }
}
