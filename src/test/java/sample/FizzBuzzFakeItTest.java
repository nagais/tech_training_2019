package sample;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

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
     * 2を渡しても'2'が返却されず失敗するテスト
     */
    @Test
    void postIntTwoReturnStrTwo() {
        // 失敗することの確認用
        // assertEquals("2", fizzBuzz.convert(2));

        assertNotEquals("2", fizzBuzz.convert(2));
    }

    /**
     * 3を渡しても'3'が返却されず失敗するテスト
     */
    @Test
    void postIntThreeReturnStrThree() {
        // 失敗することの確認用
        // assertEquals("3", fizzBuzz.convert(3));

        assertNotEquals("3", fizzBuzz.convert(3));
    }
}
