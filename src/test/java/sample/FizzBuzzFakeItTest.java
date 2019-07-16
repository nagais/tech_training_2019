package sample;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzFakeItTest {

    private FizzBuzzFakeIt fizzBuzz;

    @BeforeEach
    void setUp() {
        fizzBuzz = new FizzBuzzFakeIt();
    }

    /**
     * 1を渡したら'1'という文字列が返ること
     */
    @Test
    void postIntOneReturnStrOne() {
        assertEquals("1", fizzBuzz.convert(1));
    }

    /**
     * 2を渡したら'2'という文字列が返ること
     */
    @Test
    void postIntTwoReturnStrTwo() {
        assertEquals("2", fizzBuzz.convert(2));
    }

    /**
     * 3を渡したら'3'という文字列が返ること
     */
    @Test
    void postIntThreeReturnStrThree() {
        assertEquals("3", fizzBuzz.convert(3));
    }
}
