package oo.step3;

import oo.Klass;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class KlassTest {

    // when equals two same id teacher then return true
    @Test
    public void should_return_true_when_equals_two_number_klass() {
        Klass klass = new Klass(1);
        Klass klass2 = new Klass(1);

        assertEquals(klass,klass2);
    }
    // when equals two different id klass then return true
    @Test
    public void should_return_true_when_equals_two_number_klass1() {
        Klass klass = new Klass(1);
        Klass klass2 = new Klass(2);

        assertNotEquals(klass,klass2);
    }

}
