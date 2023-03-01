package class28.HomeWork;

import java.util.ArrayList;

public class Homework5 {
    public static void main(String[] args) {
        ArrayList<Integer> evenNumbers=new ArrayList<>(500);

        for (int i = 1; i<=500; i++) {
            evenNumbers.add(i);
        }
            evenNumbers.removeIf(e -> e % 5 == 0); {
                System.out.println(evenNumbers);
            }

        }
    }

