package FinalReview;

abstract class Instrument {

    abstract void play();
}


class Guitar extends Instrument {
    public void play(){
        System.out.println("Playing the guitar.");
    }
}


class Piano extends Instrument {
    //COMPLETE
    public void play(){
        System.out.println("Playing the piano.");
    }
}


class InstrumentDemo {
    public static void main(String[] args) {

        Instrument guitar = new Guitar();
        Instrument piano = new Piano();


        playInstrument(guitar);
        playInstrument(piano);
    }


    public static void playInstrument(Instrument instrument) {
        instrument.play();
    }
}
