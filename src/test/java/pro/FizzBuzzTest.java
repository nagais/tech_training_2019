package pro;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FizzBuzzTest {

    private FizzBuzz fizzBuzz = new FizzBuzz();

    @BeforeEach
    void setup() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    void postOneReturnOne() {
        assertEquals("1", fizzBuzz.response(1));
    }

    @Test
    void postThreeReturnFizz() {
        assertEquals("Fizz", fizzBuzz.response(3));
    }

    @Test
    void postFiveReturnBuzz() {
        assertEquals("Buzz", fizzBuzz.response(5));
    }

    @Test
    void postFifteenReturnFizzBuzz() {
        assertEquals("FizzBuzz", fizzBuzz.response(15));
    }

    @Test
    void postOneHundredReturnBuzz() {
        assertEquals("Buzz", fizzBuzz.response(100));
    }

    @Test
    void postZeroToError() {
        assertThrows(IndexOutOfBoundsException.class, () -> fizzBuzz.response(0));
    }

    @Test
    void postOneHundredOneError() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        assertThrows(IndexOutOfBoundsException.class, () -> fizzBuzz.response(101));
    }
}
