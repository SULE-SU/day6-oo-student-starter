package oo.step2;

import oo.Person;
import oo.Student;
import oo.Teacher;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {

    // when introduce a person of student then return message with name and age
    @Test
    public void should_return_message_with_name_and_age_when_introduce_a_person_of_student(){
        Student person = new Student(1,"Mike",20);
        assertEquals("My name is Mike. I am 20 years old. I am a student.",person.introduce());

    }
    // when introduce a person of teacher then return message with name and age
    @Test
    public void should_return_message_with_name_and_age_when_introduce_a_person_of_teacher(){
        Teacher person = new Teacher(1,"Leo",20);
        assertEquals("My name is Leo. I am 20 years old. I am a teacher.",person.introduce());

    }
}
