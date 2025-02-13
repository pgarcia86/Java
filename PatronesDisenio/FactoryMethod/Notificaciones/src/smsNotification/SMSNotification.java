package smsNotification;
import notification.Notification;

public class SMSNotification implements Notification{

    @Override
    public void sendNotification() {
        System.out.println("Enviando notificacion SMS");
    }
}
