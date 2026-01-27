package creational.factorymethod;

// Main class to demonstrate Factory Method Pattern
public class Main {
    public static void main(String[] args) {
        // Create the factory
        NotificationFactory factory = new NotificationFactory();

        // 1. Get an SMS Notification
        Notification msg1 = factory.createNotification("sms");
        msg1.notifyUser();

        // 2. Get an Email Notification
        Notification msg2 = factory.createNotification("email");
        msg2.notifyUser();

        // 3. Get a Push Notification
        Notification msg3 = factory.createNotification("push");
        msg3.notifyUser();
    }
}
