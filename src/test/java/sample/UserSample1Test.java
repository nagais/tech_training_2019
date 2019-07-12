package sample;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserSample1Test {

    private UserSample1 user;


    @BeforeEach
    void setUp() throws Exception {
        user = new UserSample1("man");
    }

    @Test
    void testUserManTrue() {
        assertTrue(user.isMan);
    }
}
