package PC.BuildMyPC;

public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard){
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;

    }

    public Case getTheCase(){
        return theCase;
    }

    public Monitor getMonitor(){
        return monitor;
    }

    public Motherboard getMotherboard(){
        return motherboard;
    }

    @Override
    public String toString() {
        return "PC{" +
                "theCase=" + theCase +
                "\n, monitor=" + monitor +
                "\n, motherboard=" + motherboard +
                '}';
    }
}
