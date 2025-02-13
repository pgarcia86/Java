package factories;
import pushNotification.PushNotification;

public class PushNotificationFactory extends AbstractFactory{
    
    @Override
    public PushNotification createNotification(){
        return new PushNotification();
    }
}
