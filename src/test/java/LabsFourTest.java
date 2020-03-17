import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LabsFourTest {
    LabsFour les = new LabsFour();

    @Test
    void bankNumberIsValid() {
        final int[] invalidInput={1,2,0,4,5,6,7,8,9};
        int[] validInput={1,2,3,4,5,6,7,8,9};
        assertTrue(les.bankNumberIsValid(validInput));
        Throwable exception = assertThrows(Exception.class,() -> les.bankNumberIsValid(invalidInput));
        Assertions.assertEquals("Big Oof", exception.getMessage());
    }
}