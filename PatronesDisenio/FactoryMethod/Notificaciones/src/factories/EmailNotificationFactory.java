package factories;
import emailNotification.EmailNotification;

public class EmailNotificationFactory extends AbstractFactory{

    @Override
    public EmailNotification createNotification() {
        return new EmailNotification();
    }

}
