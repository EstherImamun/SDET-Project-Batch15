package class15;

public class HomeWork4 {
     String sayHello(String countries) {
        switch (countries) {
            case "Nigeria":
                return "How you dey?";
            case "France":
                return "Bonjour!";
            case "China":
                return "Ni hao";
            case "USA":
                return "Hello";
            default:
                return "Country Unknown";

        }
    }

    public static void main(String[] args) {
        HomeWork4 hm=new HomeWork4();
        System.out.println(hm.sayHello("Nigeria"));
    }

}
