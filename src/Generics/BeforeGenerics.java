package Generics;

import java.util.ArrayList;

public class BeforeGenerics {
    public static void main(String[] args) {
        ArrayList objectItems = new ArrayList();
        objectItems.add(1);
        objectItems.add("Banana");
        objectItems.add(4.5);
        objectItems.add('t');
        objectItems.add(true);

        printlist(objectItems);
        printIntegerList(objectItems);
    }

    public static void printlist(ArrayList x){
        for(Object i : x){
            System.out.println(i);
        }
    }

    //you can test by changing the arrayList<Integer> type in the main method
    public static void printIntegerList(ArrayList<Integer> x){
        for(int i : x){
            System.out.println(i);
        }
    }
}
