package emailNotification;
import notification.Notification;

public class EmailNotification implements Notification {

    @Override
    public void sendNotification() {
        System.out.println("Enviando Email");
    }

}
