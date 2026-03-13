import org.junit.jupiter.api.Test;
import tiho.boss.IEmailService;
import tiho.boss.UserRegistration;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class UserRegistrationTest {

    @Test
    void testEmailSentAfterRegistration() {
        IEmailService emailService = mock(IEmailService.class);
        UserRegistration registration = new UserRegistration(emailService);

        registration.registerUser("test@mail.com");

        verify(emailService).sendEmail(
                "test@mail.com",
                "Welcome",
                "Welcome to our service!"
        );
    }
}