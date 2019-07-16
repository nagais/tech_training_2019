package sample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {

    private FizzBuzz fizzBuzz = new FizzBuzz();

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
     * 3を渡したら'Fizz'という文字列が返ること
     */
    @Test
    void postIntThreeReturnStrThree() {
        assertEquals("Fizz", fizzBuzz.convert(3));
    }

    /**
     * Assert roulette アンチパターン
     */
    @Test
    void testNumber() {
        assertEquals("1", fizzBuzz.convert(1));
        System.out.println("test1");

        // コメントアウトを外すと次のassertが検証されない
        // assertEquals("3", fizzBuzz.convert(2));

        assertEquals("2", fizzBuzz.convert(2));
        System.out.println("test2");
    }

    /**
     * アンチパターンの解法
     */
    @Test
    void testNumber1() {
        assertEquals("1", fizzBuzz.convert(1));
    }

    /**
     * アンチパターンの解法
     */
    @Test
    void testNumber2() {
        assertEquals("2", fizzBuzz.convert(2));
    }
}
