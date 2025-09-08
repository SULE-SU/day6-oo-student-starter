package oo.step2;

import oo.Student;
import oo.Teacher;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class TeacherTest {

    // when introduce a teacher, then return a message with name and age
    @Test
    public void should_return_a_message_with_name_and_age_when_introduce_a_teacher() {
        Teacher teacher = new Teacher(1,"Leo",20);
        assertEquals("My name is Leo. I am 20 years old. I am a teacher.",teacher.introduce());
    }
    // when equals two same id teacher then return true
    @Test
    public void should_return_true_when_equals_two_same_id_teacher() {
        Teacher teacher = new Teacher(1,"Leo",20);
        Teacher teacher2 = new Teacher(1,"Leo",20);

        assertEquals(teacher, teacher2);
    }
    // when equals two different id teacher then return true
    @Test
    public void should_return_false_when_equals_two_different_id_teacher() {
        Teacher teacher = new Teacher(1,"Leo",20);
        Teacher teacher2 = new Teacher(2,"Mike",20);

        assertFalse(teacher.equals(teacher2));
    }
}
