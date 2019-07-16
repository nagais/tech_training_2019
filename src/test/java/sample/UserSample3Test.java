package sample;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class UserSample3Test {

    private UserSample3 user;

    @BeforeEach
    void setUp() {
        user = new UserSample3(UserSample3.Sex.MAN);
    }

    /**
     * 男性ユーザから男性かどうかを取得するとtrueになること
     */
    @Test
    void testUserManResultTrue() {
        assertTrue(user.isMan());
    }
}