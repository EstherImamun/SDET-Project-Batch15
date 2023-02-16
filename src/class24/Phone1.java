package class24;

public abstract class Phone1 {
    /*
    create a phone class, create abstract methods like displayPictures, unlockPhone, sendText
    create child classes, IPhone, Samsung, Google and provide specific implementation
    let's write code to achieve run time polymorphism.
     */
    abstract void displayPictures();
    abstract void unlockPhone();
    abstract void sendText();
}
class IPhone1 extends Phone1{
    @Override
    void displayPictures() {
        System.out.println("IPhone is displaying pictures from camera roll");
    }

    @Override
    void unlockPhone() {
        System.out.println("IPhone is unlocked");
    }

    @Override
    void sendText() {
        System.out.println("IPhone is sending a message");
    }
}
class Samsung1 extends Phone1{

    @Override
    void displayPictures() {
        System.out.println("Samsung Phone is showing pictures from collage");
    }

    @Override
    void unlockPhone() {
        System.out.println("Samsung Phone has been unlocked");
    }

    @Override
    void sendText() {
        System.out.println(" Samsung Phone is sending text messages");
    }

    public static void main(String[] args) {
        Phone1[] phones={new IPhone1(),new Samsung1()};
        for (int i = 0; i < phones.length; i++) {
            Phone1 f=phones[i];
            f.displayPictures();
            f.sendText();
            f.unlockPhone();
        }


    }
}
