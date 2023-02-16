package class24;

public abstract class Phone {
     /*
    create a phone class, create abstract methods like displayPictures, unlockPhone, sendText
    create child classes, IPhone, Samsung, Google and provide specific implementation
    let's write code to achieve run time polymorphism.
     */

    abstract void unlockPhone();
    abstract void SendText();
    abstract void displayPictures();
}
class IPhone extends Phone{
    @Override
    void unlockPhone() {
        System.out.println("FaceId to unlock the Phone");
    }

    @Override
    void SendText() {
        System.out.println("Let's use the IMessage to send the text");
    }

    @Override
    void displayPictures() {
        System.out.println("Iphotos to browse the pictures");
    }
}
class Samsung extends Phone{

    @Override
    void unlockPhone() {
        System.out.println("Using FingerPrint sensor or camera");
    }

    @Override
    void SendText() {
        System.out.println("Messages app to send the message");
    }

    @Override
    void displayPictures() {
        System.out.println("Gallery app to browse the photos");
    }
}
