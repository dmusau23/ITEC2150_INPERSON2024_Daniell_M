package PC.BuildMyPC;

public class Dimension {

    private double height;
    private double width;
    private double depth;

    public Dimension(double height, double width, double depth){
        this.depth = depth;
        this.height = height;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Dimension{" +
                "height=" + height +
                ", width=" + width +
                ", depth=" + depth +
                '}';
    }
}
