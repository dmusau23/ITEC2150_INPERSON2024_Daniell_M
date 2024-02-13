package inheritanceDemoV2;

import animal.Animal;

public class Mammal extends Animal {

    private boolean hasFur;
    private boolean giveBirth;

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
