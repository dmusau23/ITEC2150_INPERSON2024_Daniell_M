package PointDemo;

//   a (x1, y1)  b (x2, y2)  c (x3, y3)
public class NamedPoint extends Point{

    private String name;

    public NamedPoint(double x, double y, String name){
        super(x,y);
        this.name = name;
    }

    public String getName(){
        return name;
    }
    //a(1,2)
    public String toString(){
        return name + super.toString();
        //return name + "(" + getX() + ", " + getY()+ ")" ;
    }
}
