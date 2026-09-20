public class NotificationSystem {
    public static void main(String[] args) {
        //EmailNotification en = new EmailNotification();
        //SMSNotification sn = new SMSNotification();
        //PushNotification pn = new PushNotification();
        //WhatsAppNotification wn = new WhatsAppNotification();
        //Notification[] notifications = {en, sn, pn, wn};
        Notification[] notifications = {new EmailNotification(), new SMSNotification(), new PushNotification(), new WhatsAppNotification()};
        sendAllNotifications(notifications);
    }
    static void sendAllNotifications(Notification[] notifications){
        for(Notification notification : notifications){
            System.out.println(notification.sendNotification());
        }
    }
}

interface Notification{
    String sendNotification();//by default interface methods are "public abstract", so no need to write it.
}

class EmailNotification implements Notification {
    @Override
    public String sendNotification(){
        return "Email notification sent successfully";
    }
}

class SMSNotification implements Notification {
    @Override
    public String sendNotification(){
        return "SMS notification sent successfully";
    }
}

class PushNotification implements Notification {
    @Override
    public String sendNotification(){
        return "Push notification sent successfully";
    }
}

//Extra notification for fun
class WhatsAppNotification implements Notification {
    @Override
    public String sendNotification(){
        return "WhatsApp notification sent successfully";
    }
}
/*

INTERVIEW FOLLOW-UP QUESTIONS AND ANSWERS

1. Why is an interface preferred over an abstract class here?

Answer:

The notification types only require a common contract.

They do not require common instance fields, constructors,

or shared implementation. Therefore, an interface is more

suitable than an abstract class.


2. Why must sendNotification() be public in the implementing classes?

Answer:

Interface methods are implicitly public and abstract.

An overriding method cannot reduce the access level of the

inherited method. Therefore, sendNotification() must be public.


3. Where is runtime polymorphism used in this solution?

Answer:

Runtime polymorphism occurs when a Notification reference

stores an object of EmailNotification, SMSNotification,

PushNotification, or WhatsAppNotification.


During the method call:


notification.sendNotification();


Java executes the overridden method based on the actual object

available at runtime.


4. Where is loose coupling used in this solution?


Answer:

The sendAllNotifications() method depends on the Notification

interface instead of depending on concrete notification classes.


Because of this, the method can process any current or future

class that implements Notification.


5. How does this design follow the Open/Closed Principle?


Answer:

The design is open for extension because a new notification

type can be added by implementing the Notification interface.


Existing notification classes and the sendAllNotifications()

method do not need to be modified.


6. Does this solution fully follow the Dependency Inversion Principle?


Answer:

It follows the principle partially.


The sendAllNotifications() method depends on the Notification

abstraction, which is correct. However, the main method still

creates concrete notification objects directly.


A factory or dependency injection can separate object creation

from the client code in a larger application.


7. Why is public abstract not written in the interface method?


Answer:

Interface methods without a body are implicitly public and

abstract. Therefore, writing public abstract is optional.


Both declarations mean the same thing:


String sendNotification();


public abstract String sendNotification();


8. Can one notification class implement multiple interfaces?


Answer:

Yes. Java allows a class to implement multiple interfaces.


For example:


class EmailNotification

        implements Notification, Retryable {

}


9. What happens if a class does not implement sendNotification()?


Answer:

A concrete class must implement all abstract methods of the

interface. Otherwise, the class must be declared abstract.


10. How can a new notification type be added?


Answer:

Create a new class that implements Notification and provide

the sendNotification() implementation.


Example:


class SlackNotification implements Notification {


    @Override

    public String sendNotification() {

        return "Slack notification sent successfully";

    }

}


The existing notification-processing logic does not need

to be changed.

*/