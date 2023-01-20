package class10;
/*
Limitations of Foreach loop
 */
public class ForEachLoopDemo3 {
    public static void main(String[] args) {

        int[] arr = {10, 13, 20, 25, 45, 50};
        // we can't update the elements in for each loop because we don't have access to the index;

        for(int x: arr){
           if(x%2!=0){
               x=0;  // this will not update because ForEachLoop or Enhanced for loop
               System.out.println(x); // doesn't update, it only prints indexes.
           }
        }
    }
}
