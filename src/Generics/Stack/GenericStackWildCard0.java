package Generics.Stack;

public class GenericStackWildCard0 {

    public static double max(GenericStack<Number> stack){
        double max = stack.pop().doubleValue();
        return max;
    }
    //do chapter 6 and submit the repo to the prof
    public static void print(GenericStack<?> stack){

    }
}
