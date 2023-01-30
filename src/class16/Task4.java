package class16;

public class Task4 {
    String sayHello(String countryName){
        switch (countryName){
            case"USA":
                return "Hello";  // break is not needed when we use the return keyword
            case "Kazakhstan":
                return "Salem";
            case "Italy":
                return "Ciao";
            case "China":
                return "Ni hao";
            default:
                return "Country not supported";

        }
    }

    public static void main(String[] args) {
        Task4 task4=new Task4();
        task4.sayHello(task4.sayHello("USA"));
    }
}
