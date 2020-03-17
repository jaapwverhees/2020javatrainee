import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HomeWorkSixTest {

    Long[] array;
    HomeWorkSix les = new HomeWorkSix();

    @BeforeEach
    void setUp() {
        array = new Long[]{1L, 2L, 3L};
    }

    @Test
    void doubleLengthArray() {
        Long[] testCondition = new Long[]{1L,2L,3L,0L,0L,0L};
        assertArrayEquals(testCondition, les.doubleLengthArray(array));
    }

    @Test
    void multiplyValuesinAnArray() {
        Long[] testCondition = new Long[]{2L,4L,6L};
        assertArrayEquals(testCondition, les.multiplyValuesinAnArray(array,2));
    }
}