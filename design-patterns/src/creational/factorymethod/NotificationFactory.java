package creational.factorymethod;

// Factory class
public class NotificationFactory {
    // The Factory Method
    // Takes a parameter (e.g., String) to determine the type of object to return.
    public Notification createNotification(String channel) {
        if (channel == null || channel.isEmpty()) {
            return null;
        }

        return switch (channel.toLowerCase()) {
            case "sms" -> new SMSNotification();
            case "email" -> new EmailNotification();
            case "push" -> new PushNotification();
            default -> throw new IllegalArgumentException("Unknown Channel: " + channel);
        };
    }
}
