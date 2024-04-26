package Generics.Container;

public class Container<T> {
    private T variable;

    public Container(){

    }

    public Container(T x){
        this.variable = x;
    }

    public T getVariable() {
        return variable;
    }

    public void setVariable(T variable) {
        this.variable = variable;
    }
}
