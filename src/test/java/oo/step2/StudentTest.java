package oo.step2;

import oo.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class StudentTest {

    // when introduce a student, then return a message with name and age
    @Test
    public void should_return_a_message_with_name_and_age_when_introduce_a_student() {
        Student student = new Student(1,"Leo",20);
        assertEquals("My name is Leo. I am 20 years old. I am a student.",student.introduce());
    }
    // when equals two same id student then return true
    @Test
    public void should_return_true_when_equals_two_same_id_student() {
        Student student = new Student(1,"Leo",20);
        Student student2 = new Student(1,"Leo",20);

        assertEquals(student, student2);
    }
    // when equals two different id student then return true
    @Test
    public void should_return_false_when_equals_two_different_id_student() {
        Student student = new Student(1,"Leo",20);
        Student student2 = new Student(2,"Leo",20);

        assertFalse(student.equals(student2));
    }
}
