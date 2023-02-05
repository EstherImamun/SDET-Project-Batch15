package class17;

public class Dog {
    String name;
    String breed;
    String colour;
    int age;
    double weight;

   Dog(String dogName,String dogBreed,String dogColour,int dogAge,double dogWeight){
    name=dogName;
    breed=dogBreed;
    colour=dogColour;
    age=dogAge;
    weight=dogWeight;
}
void printInfo(){
       System.out.println("Name "+name+" Breed "+breed+" colour "+colour+" age "+age+" weight "+weight);
}


}
