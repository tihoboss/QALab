package tiho.boss;

public class UserRegistration {

    private IEmailService emailService;

    public UserRegistration(IEmailService emailService) {
        this.emailService = emailService;
    }

    public void registerUser(String email) {
        String subject = "Welcome";
        String body = "Welcome to our service!";

        emailService.sendEmail(email, subject, body);
    }
}