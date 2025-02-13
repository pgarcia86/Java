package pushNotification;
import notification.Notification;

public class PushNotification implements Notification{

    @Override
    public void sendNotification() {
        System.out.println("Enviando notificacion push");
    }

}
