package InheritanceDemoV1;

public class Mammal extends Animal {

    private boolean hasFur; //false
    private boolean giveBirth; //false


    public Mammal(){

       super(false,2, "Omnivore");

    }

    public Mammal(boolean hasFur, boolean giveBirth){

        super(false, 2, "Carnivore");
        this.hasFur = hasFur;
        this.giveBirth = giveBirth;
        //this();
    }

    @Override
    public void makeNoise(){
        super.makeNoise();
        System.out.println(" Meow~~~");
    }

    @Override
    public void eat(){
        super.eat();
        System.out.println(" Yummy ");
    }

}
