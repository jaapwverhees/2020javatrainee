package StringToInt;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class StringerTest {

    Stringer stringer = new Stringer();

    @Test
    void validInputStringAdder() {
        String string = "123";
        assertEquals(6, stringer.stringAdder("123"));
        assertEquals(0, stringer.stringAdder("sdfsdfsdf"));
        assertEquals(6, stringer.stringAdder("12\n3"));
        assertEquals(-1, stringer.stringAdder("sfwefwefw-1"));
        assertEquals(2, stringer.stringAdder("sfwesdfsdfsdf5-2fwefw--1"));
    }

    @Test
    void stringAdderNotNegative() throws Exception {
        assertEquals(6, stringer.stringAdderNotNegative("123"));
        assertEquals(0, stringer.stringAdderNotNegative("sdfsdfsdf"));
        assertEquals(6, stringer.stringAdderNotNegative("12\n3"));
        Throwable exception = assertThrows(Exception.class,() -> stringer.stringAdderNotNegative("dfqwdfqwd-1"));
        Assertions.assertEquals("Negatives are not allowed, negatives are: -1", exception.getMessage());
        exception = assertThrows(Exception.class,() -> stringer.stringAdderNotNegative("-1dfqwdfqwd-1"));
        Assertions.assertEquals("Negatives are not allowed, negatives are: -1 -1", exception.getMessage());
        //TODO check for number greater then 9;
    }
}