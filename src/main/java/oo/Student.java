package oo;

import java.util.Objects;

public class Student extends Person {
    private Integer id;
    private Integer age;
    private String name;

    public Student(Integer id, String name, Integer age) {
        super(id, name, age);
    }

    public String introduce() {
        return String.format("My name is %s. I am %s years old. I am a student.", getName(), getAge());
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(id, student.id) && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, age, name);
    }
}
