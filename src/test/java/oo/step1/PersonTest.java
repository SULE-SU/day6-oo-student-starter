package oo.step1;

import oo.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {


    // when introduce a person, then return a message with name and age
    @Test
    public void should_return_a_message_with_name_and_age_when_introduce(){
        Person person = new Person(1,"Tom",20);
        assertEquals("My name is Tom. I am 20 years old.",person.introduce());
    }




}
