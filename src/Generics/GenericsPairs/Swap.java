package Generics.GenericsPairs;

public class Swap {

    public <T> void  swap(T[] arr, int index1, int index2){
        T temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }
}
