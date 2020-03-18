import human.Gender;
import human.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LessonTwoTest {

    LessonTwo les = new LessonTwo();

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
    @Test
    void testPerson() {
        Person p = new Person("Jan", 45);
        System.out.println(p.getGender());
        p.setGender(Gender.MALE);
        System.out.println(p.getGender());
        p.haveBirthday(); // person gets one year older
        System.out.println(p.getAge());
        System.out.println(Person.numberOfPossibleGenders);
        System.out.println(p.toString());
    }

}