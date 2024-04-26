package Generics.Stack;

public class GenericStackTester {
    public static void main(String[] args) {
        //at least two GenericStack<E> objects and add (you need to think which method to invoke) and test your work.
        GenericStack<Integer> integerGenericStack = new GenericStack<Integer>();
        integerGenericStack.push(5);
        integerGenericStack.push(79);
        integerGenericStack.push(100);

        GenericStack<String> stringGenericStack = new GenericStack<String>();
        stringGenericStack.push("Gas");
        stringGenericStack.push("Diesel");
        stringGenericStack.push("Fuel");

        GenericStack<Character> characterGenericStack = new GenericStack<Character>();
        characterGenericStack.push('t');
        characterGenericStack.push('g');
        characterGenericStack.push('f');

        System.out.println(integerGenericStack);
        System.out.println(stringGenericStack);
        System.out.println(characterGenericStack);
    }
}
