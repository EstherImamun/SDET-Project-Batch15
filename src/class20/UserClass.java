package class20;

public class UserClass {
    String name;
    String mobileNumber;

    UserClass(String name, String mobileNumber){
       this.name=name;
       this.mobileNumber=mobileNumber;
    }
}

class UserInfo extends UserClass {
      String Address;

      UserInfo(String name, String mobileNumber, String Address){
          super(name, mobileNumber);
          this.Address=Address;

      }
      void userDetails(){
          System.out.println("Name of user is "+name+", Mobile number is "+mobileNumber+" and the address is "+Address);
      }
}
