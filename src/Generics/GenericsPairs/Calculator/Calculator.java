package Generics.GenericsPairs.Calculator;

public class Calculator <T extends Number>{

    public T add(T a, T b){
        if(a instanceof Double || b instanceof Double){
            return (T)Double.valueOf(a.doubleValue() + b.doubleValue());
        } else if (a instanceof Float || b instanceof Float) {
            return (T)Float.valueOf(a.floatValue() + b.floatValue());
        } else if (a instanceof Long || b instanceof Long) {
            return (T)Long.valueOf(a.longValue() + b.longValue());
        }else return (T) Integer.valueOf(a.intValue() + b.intValue());
    }
    /**
     * complete by adding other methods for substraction, multplicatiion and division
     */
}
