package factories;
import smsNotification.SMSNotification;

public class SMSNotificationFactory extends AbstractFactory{

    public SMSNotification createNotification(){
        return new SMSNotification();
    }

}
