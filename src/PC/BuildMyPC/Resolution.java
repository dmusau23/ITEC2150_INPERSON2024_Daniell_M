package PC.BuildMyPC;

public class Resolution {
    private double height;
    private double width;

    public Resolution(double height, double width){
        this.height = height;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Resolution{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }
}
