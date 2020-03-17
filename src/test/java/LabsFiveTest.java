import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LabsFiveTest {
    LabsFive les = new LabsFive();
    @BeforeEach
    public void setup(){
        les = new LabsFive();
    }
    @Test
    void TestIfGreatestOfTwoNumbersIsReturned() {
        Assertions.assertEquals(les.greatest(1,2), 2);
    }

    @Test
    void testIfgreatestLengthStringOfTwoIsReturned() {
        assertEquals(les.greatestLength("shrtString", "Long String"), "Long String");
    }

    @Test
    void testIfgreatestNumberOfaVariableLengthListisReturned() {
        Assertions.assertEquals(les.greatestNumber(1,2,3,4,5,2), 5);
    }

    @Test
    void testIsCorrectFactorialIsReturned() {
        Assertions.assertEquals(120, les.factorial(5));
    }
}