package Generics.GenericsPairs;

public class GenericPairTester {
    public static void main(String[] args) {
        GenericsPairs<Integer> gp = new GenericsPairs<Integer>(10,20);
        Integer x = gp.getFirst();
        Integer y = gp.getSecond();

        int xInt = x.intValue();
        int yInt = y.intValue();

        //0r boxing
        Integer newX = Integer.valueOf(xInt);

    }
}
