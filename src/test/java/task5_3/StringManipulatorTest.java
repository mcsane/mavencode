package task5_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringManipulatorTest {

    @Test
    void concatenate() {
        StringManipulator sm = new StringManipulator();
        assertEquals("HelloWorld", sm.concatenate("Hello", "World"));
    }
    @Test
    void findLength() {
        StringManipulator sm = new StringManipulator();
        assertEquals(5, sm.findLength("Hello"));
    }
    @Test
    void convertToUpperCase() {
        StringManipulator sm = new StringManipulator();
        assertEquals("HELLO", sm.convertToUpperCase("Hello"));
    }
    @Test
    void convertToLowerCase() {
        StringManipulator sm = new StringManipulator();
        assertEquals("hello", sm.convertToLowerCase("Hello"));
    }

}