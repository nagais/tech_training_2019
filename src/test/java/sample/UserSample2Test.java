package sample;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UserSample2Test {

    private UserSample2 user;

    @BeforeEach
    void setUp() throws Exception {
        user = new UserSample2("");
    }

    /**
     * 男性ユーザから男性かどうかを取得するとtrueになること
     */
    @Test
    void testUserManResultTrue() {
        user = new UserSample2("man");
        assertTrue(user.isMan());
    }

    /**
     * 女性ユーザから男性かどうかを取得するとfalseになること
     */
    @Test
    void testUserWomanResultFalse() {
        user = new UserSample2("woman");
        assertFalse(user.isMan());
    }
}