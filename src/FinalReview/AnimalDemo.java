package FinalReview;

class Animal {
    public void move() {
        System.out.println("ANIMAL MOVES.");
    }
}


class Bird extends Animal {
    @Override
    public void move() {
        System.out.println("Bird flies.");
    }
}

class Fish extends Animal {
    @Override
    public void move() {
        System.out.println("Fish swims.");
    }
}


public class AnimalDemo {
    public static void main(String[] args) {

        // Create an array of Animal objects
        Animal[] animals = new Animal[4];

        //add two Bird() objects to animals and two Fish objects to animals.
        //COMPLETE HERE
        Bird b1 = new Bird();
        Bird b2 = new Bird();
        Fish f1 = new Fish();
        Fish f2 = new Fish();
        animals[0]= b1;
        animals[1] = b2;
        animals[2] = f1;
        animals[3] = f2;



        // Iterate over the array and call move method
        for (Animal animal : animals) {
            animal.move();
        }
    }
}