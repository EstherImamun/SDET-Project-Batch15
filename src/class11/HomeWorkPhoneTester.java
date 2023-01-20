package class11;

public class HomeWorkPhoneTester {
    public static void main(String[] args) {
        HomeWorkPhone phone1=new HomeWorkPhone();// Object 1
        phone1.name="IPhone";
        phone1.colour="Rose Gold";
        phone1.type="Pro Max";
        phone1.version="Iphone12";
        phone1.quality=true;
        phone1.download();
        phone1.call();
        phone1.research();


        HomeWorkPhone phone2=new HomeWorkPhone();  //Object 2
        phone2.name="Samsung";
        phone2.colour="Black";
        phone2.type="Samsung S10+";
        phone2.quality=true;
        phone2.ring();
        phone2.email();
        phone2.camera();


        HomeWorkPhone phone3=new HomeWorkPhone();  // Object3
        phone3.name="Pixel";
        phone3.type="Pixel 7 pro";
        phone3.colour="Lemongrass";
        phone3.ring();
        phone3.call();
        phone3.screen();



    }
}
