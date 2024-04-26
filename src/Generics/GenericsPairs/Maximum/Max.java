package Generics.GenericsPairs.Maximum;

import java.util.Comparator;

public class Max {

    public static <T extends Comparable<T>> T findMax(T[] arr){
        if(arr == null || arr.length == 0){
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        T max = arr[0];
        //enhanced for loop/ for each loop
        for(T value: arr){
            if(value.compareTo(max) > 0){
                max = value;
            }
        }

        return max;
    }

    public static <T> T findMax(T[] arr, Comparator<T> comparator){
        if(arr == null || arr.length == 0){
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        T max = arr[0];
        //enhanced for loop/ for each loop
        for(T value: arr){
            if(comparator.compare(value,max) > 0){
                max = value;
            }
        }

        return max;
    }
}
