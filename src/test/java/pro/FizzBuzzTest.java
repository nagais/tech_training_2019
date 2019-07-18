package pro;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FizzBuzzTest {

    @Nested
    class theArgumentIsNotAMultipleOf3And5 {
        FizzBuzz fizzBuzz = new FizzBuzz();

        @Test
        void postOneReturnOne() {
            assertEquals("1", fizzBuzz.response(1));
        }
    }

    @Nested
    class argumentMultipleOnlyThree {
        FizzBuzz fizzBuzz = new FizzBuzz();

        @Test
        void postThreeReturnFizz() {
            assertEquals("Fizz", fizzBuzz.response(3));
        }
    }

    @Nested
    class argumentMultipleOnlyFive {
        FizzBuzz fizzBuzz = new FizzBuzz();

        @Test
        void postFiveReturnBuzz() {
            assertEquals("Buzz", fizzBuzz.response(5));
        }
    }

    @Nested
    class argumentMultipleThreeAndFive {
        FizzBuzz fizzBuzz = new FizzBuzz();

        @Test
        void postFifteenReturnFizzBuzz() {
            assertEquals("FizzBuzz", fizzBuzz.response(15));
        }
    }

    @Nested
    class argumentEffectiveBoundaryValue {
        FizzBuzz fizzBuzz = new FizzBuzz();

        @Test
        void postOneReturnOne() {
            assertEquals("1", fizzBuzz.response(1));
        }

        @Test
        void postOneHundredReturnBuzz() {
            assertEquals("Buzz", fizzBuzz.response(100));
        }
    }

    @Nested
    class argumentInvalidBoundaryValue {
        FizzBuzz fizzBuzz = new FizzBuzz();

        @Test
        void postZeroToError() {
            assertThrows(IndexOutOfBoundsException.class, () -> {
                fizzBuzz.response(0);
            });
        }

        @Test
        void postOneHundredOneError() {
            FizzBuzz fizzBuzz = new FizzBuzz();

            assertThrows(IndexOutOfBoundsException.class, () -> {
                fizzBuzz.response(101);
            });
        }
    }
}
