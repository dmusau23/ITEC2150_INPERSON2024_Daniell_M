package Generics.GenericsPairs;

import Generics.Stack.GenericStack;

public class GenericsPairs <T>{
    private T first;
    private T second;

    public GenericsPairs(T first, T second){
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        this.second = second;
    }
}
