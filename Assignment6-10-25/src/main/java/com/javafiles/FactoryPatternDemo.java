package com.javafiles;

interface Notification {
 void notifyUser();
}

//Step 2: Create concrete classes
class EmailNotification implements Notification {
 @Override
 public void notifyUser() {
     System.out.println("Sending an Email notification");
 }
}

class SMSNotification implements Notification {
 @Override
 public void notifyUser() {
     System.out.println("Sending an SMS notification");
 }
}

class PushNotification implements Notification {
 @Override
 public void notifyUser() {
     System.out.println("Sending a Push notification");
 }
}

//Step 3: Create NotificationFactory
class NotificationFactory {
 public Notification createNotification(String type) {
     if (type == null || type.isEmpty()) {
         return null;
     }
     switch (type.toUpperCase()) {
         case "EMAIL":
             return new EmailNotification();
         case "SMS":
             return new SMSNotification();
         case "PUSH":
             return new PushNotification();
         default:
             throw new IllegalArgumentException("Unknown notification type: " + type);
     }
 }
}

public class FactoryPatternDemo {
 public static void main(String[] args) {
     NotificationFactory factory = new NotificationFactory();

     Notification n1 = factory.createNotification("EMAIL");
     n1.notifyUser();

     Notification n2 = factory.createNotification("SMS");
     n2.notifyUser();

     Notification n3 = factory.createNotification("PUSH");
     n3.notifyUser();
 }
}
