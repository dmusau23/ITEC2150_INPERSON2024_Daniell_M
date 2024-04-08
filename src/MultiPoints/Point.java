package MultiPoints;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public static double distance(Point p1, Point p2){
        double a = p2.getX()-p1.getX();
        double b = p2.getY()-p1.getY();
        return Math.sqrt(Math.pow(a,2) + Math.pow(b,2));

    }
}
