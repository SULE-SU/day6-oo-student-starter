package oo.step5;

import oo.Klass;
import oo.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class KlassTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    void setUp(){
        System.setOut(new PrintStream(outContent));
    }

    // when assign leader given student is not in class then print prompt message
    @Test
    public void should_return_true_when_isLeader_given_assign_leader_of_student_is_the_class() {
        Klass klass = new Klass(1);
        Student student = new Student(1, "Bob", 18);
        student.join(klass);
        klass.assignLeader(student);
        assertTrue(klass.isLeader(student));
    }

    @Test
    public void should_print_message_when_isLeader_given_assign_leader_of_student_is_not_the_class() {
        Klass klass = new Klass(1);
        Student student = new Student(1, "Bob", 18);
        klass.assignLeader(student);
        assertTrue(outContent.toString().contains("It is not one of us."));
    }



}
