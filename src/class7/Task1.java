package class7;

public class Task1 {
    public static void main(String[] args) {
        /* Create a boolean variable workDay and assign true
        create an int variable day and assign it to 1
        as long as it is workDay print "I need a day off" and increase day.
        once day is 6 print "I do not need a day off anymore"

       */
        boolean workDay=true;
        int day=1;
        while(workDay){
            if(day<=5){
                System.out.println("I need a day off");
            }else{
                System.out.println("I do not need a day off");
                workDay=false;
            }
            day++; // it is equal to day=day+1, day+=1
        }

    }
}
