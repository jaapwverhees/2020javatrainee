import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HomeworkFourTest {

    @Test
    void hourglass() {
        Season season = Season.WINTER;
        HomeworkFour les = new HomeworkFour();
        assertEquals("cold", les.hotOrNot(season));
    }
}