package tiho.boss;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class EmailValTest {

    @ParameterizedTest
    @ValueSource(strings = {
            "test@gmail.com",
            "user123@mail.ru",
            "name.surname@yahoo.com",
            "a@b.com"
    })
    void validEmails(String email) {
        assertTrue(EmailVal.isValidEmail(email));
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "plainaddress",
            "@gmail.com",
            "user@",
            "usergmail.com"
    })
    void invalidEmails(String email) {
        assertFalse(EmailVal.isValidEmail(email));
    }
}