package creational.factorymethod;

// Concrete implementation 3: Push
public class PushNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending an Email Notification...");
    }
}
