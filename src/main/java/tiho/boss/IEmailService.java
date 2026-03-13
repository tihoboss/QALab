package tiho.boss;

public interface IEmailService {
    void sendEmail(String to, String subject, String body);
}