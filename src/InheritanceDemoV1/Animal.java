package InheritanceDemoV1;

/**
 * superclass with three data/attributes
 * constructor taking three attributes
 */
public class Animal {

    protected boolean beingDangerous;
    protected int numberOfLegs;
    protected String diet;

    public Animal(boolean beingDangerous, int numberOfLegs, String diet){
        this.beingDangerous = beingDangerous;
        this.numberOfLegs = numberOfLegs;
        this.diet = diet;
    }

    public boolean isBeingDangerous() {
        return beingDangerous;
    }

    public void setBeingDangerous(boolean beingDangerous) {
        this.beingDangerous = beingDangerous;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public void makeNoise(){
        System.out.print("Animal Class: Make noise -  ");
    }

    public void eat(){
        System.out.print("Animal class: Eating -  ");
    }



}
