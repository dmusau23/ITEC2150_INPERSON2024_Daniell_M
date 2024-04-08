package InterfacesDemo.Game;

import java.util.ArrayList;
import java.util.List;

import static java.lang.String.valueOf;

public class King implements ISavable, Comparable<Queen>{
    //four attributes of King class
    private String name;
    private int points;
    private String direction;
    private String color;

    public King(String name, int points, String direction, String color) {
        this.name = name;
        this.points = points;
        this.direction = direction;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public List<String> write() {
        List<String> value = new ArrayList<String>();
        value.add(this.name);
        value.add(valueOf(this.points));
//        value.add(""+this.points);
        value.add(this.direction);
        value.add(this.color);
        return null;
    }

    @Override
    public void read(List<String> lsv) {
        if(lsv != null && lsv.size() > 0){
            this.name = lsv.get(0);
            this.points = Integer.parseInt(lsv.get(1));
            this.direction = lsv.get(2);
        }
    }


    public int compareTo(Queen q){
        if (this.points > q.getPoints()){
            System.out.println(this.getName() +" has more points than " +q.getName());
            return 1;
        }else if(this.points < q.getPoints()){
            System.out.println(q.getName() +" has more points than " +this.getName());
            return -1;
        }else{
            System.out.println("They all have equal points!");
            return 0;
        }
    }

    @Override
    public String toString() {
        return "King{" +
                "name='" + name + '\'' +
                ", points=" + points +
                ", direction='" + direction + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
