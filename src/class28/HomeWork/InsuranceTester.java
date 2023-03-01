package class28.HomeWork;

import java.util.ArrayList;
import java.util.Iterator;

public class InsuranceTester {
    public static void main(String[] args) {
        ArrayList<Insurance> insurances=new ArrayList<>();
        Car car=new Car("John", "Mercedes-Benz");
        insurances.add(car);

        Pet pet=new Pet("Jacky", "BullDog");
        insurances.add(pet);

        Health health=new Health("Mandy");
        insurances.add(health);

        for (int i = 0; i < insurances.size(); i++) {
            Insurance x=insurances.get(i);
            x.getQuote();
            x.cancelInsurance();
        }

        for(Insurance y:insurances){
            y.getQuote();
            y.cancelInsurance();
        }

        Iterator<Insurance> iterator=insurances.iterator();
            while(iterator.hasNext()){
                Insurance a=iterator.next();
                a.getQuote();
                a.cancelInsurance();
            }
        }

    }

