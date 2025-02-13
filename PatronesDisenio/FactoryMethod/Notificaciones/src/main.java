import factories.AbstractFactory;
import factories.EmailNotificationFactory;
import factories.PushNotificationFactory;
import factories.SMSNotificationFactory;
import notification.Notification;

public class main {
    public static void main(String[] args) throws Exception {
        AbstractFactory emailFactory = new EmailNotificationFactory();
        AbstractFactory smsFactory = new SMSNotificationFactory();
        AbstractFactory pushFactory = new PushNotificationFactory();
        Notification email = emailFactory.createNotification();
        Notification sms = smsFactory.createNotification();
        Notification push = pushFactory.createNotification();

        email.sendNotification();
        sms.sendNotification();
        push.sendNotification();
    }
}
