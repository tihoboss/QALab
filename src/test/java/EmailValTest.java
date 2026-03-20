import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import tiho.boss.EmailVal;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

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