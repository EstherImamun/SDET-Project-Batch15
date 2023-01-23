package class11;

public class Homework2DArrays6 {
    public static void main(String[] args) {
        String[][] countries={{"Untied States","Canada","Mexico"},
                              {"Argentina","Brazil","Columbia"},
                              {"Luxembourg","Germany","Belgium"},
                              {"Japan","China","India"},
                              {"Nigeria","Ghana","Congo"}
        };

        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                System.out.print(countries[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("**********************************************");

    int count=0;
        for (String[]places: countries ){
            for(String x: places) {
                System.out.print(x + " ");
                count++;
            }
                  System.out.println();
            {
                System.out.println("Total countries "+count);
                }
            System.out.println();
            }
        }
    }

