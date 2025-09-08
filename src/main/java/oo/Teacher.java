package oo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Teacher extends Person {
    private Integer id;
    private Integer age;
    private String name;
    private List<Klass> klasses =new ArrayList<>();

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }


    @Override
    public String introduce() {
        return String.format("My name is %s. I am %s years old. I am a teacher. I teach Class %s.", getName(), getAge(),klasses.stream().
                map(klass -> klass.getNumber().toString()).collect(Collectors.joining(", ")));
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

    public boolean belongsTo(Klass klass) {
        return this.klasses.contains(klass);
    }

    public void assignTo(Klass klass) {
        if(!this.klasses.contains(klass)){
            this.klasses.add(klass);
        }
    }



    public boolean isTeaching(Student student) {
        return this.klasses.contains(student.getKlass());
    }
}
