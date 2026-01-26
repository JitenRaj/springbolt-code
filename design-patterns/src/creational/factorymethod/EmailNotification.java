package creational.factorymethod;

// Concrete implementation 2: Email
public class EmailNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Sending an Email Notification...");
    }
}
