package GroupProject;

public class ProjectQuestion9 {
    public static void main(String[] args) {
        int[] values={7,4,3,6,1,9};

        int maximumV=0;
        int minimumV=0;
        for (int i = 0; i < values.length; i++) {
            if(maximumV < values[i]){
                maximumV=values[i];}
            if(minimumV>values[i]){
                minimumV=values[i];
            }
            System.out.println("The maximum number in this array is "+maximumV+" and the minimum number is "+minimumV+" ");
        }
        System.out.println();
    }
}

