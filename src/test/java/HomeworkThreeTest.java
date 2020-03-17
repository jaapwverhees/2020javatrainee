import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HomeworkThreeTest {
    HomeworkThree les = new HomeworkThree();
    @Test
    void calculateHours() {
        Assertions.assertEquals(les.calculateHours(23,5), 4);
        Assertions.assertEquals(les.calculateHours(1,5), 6);
    }

    @Test
    void convertbinaryToInt() {
        Assertions.assertEquals(les.convertbinaryToInt("1010"),10);
    }

    @Test
    void weirdAlgoritm() {
        Assertions.assertEquals(les.weirdAlgoritm(3), 2);
    }

    @Test
    void compareTheIs() {
        Assertions.assertEquals("Copy result of i++ is 4, Copy result of ++i is 5",les.compareTheIs(4));
    }
}