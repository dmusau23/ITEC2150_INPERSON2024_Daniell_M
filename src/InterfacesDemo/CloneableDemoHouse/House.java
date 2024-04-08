package InterfacesDemo.CloneableDemoHouse;

import java.util.Date;

public class House implements Cloneable, Comparable<House>{

    private int id;
    private double area;
    private Date whenbuilt;

    public House(int id, double area){
        this.id = id;
        this.area = area;
        this.whenbuilt = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Object cloneShallow(){
        try{
            return super.clone();
        }catch (CloneNotSupportedException e){
            return null;
        }
    }

    public Object cloneDeep(){
        House houseClone = new House(id, area);
        houseClone.whenbuilt = new Date();

        //copy the elements of the Date() type object
        houseClone.whenbuilt.setTime(whenbuilt.getTime());
        //how to plug this data to copy to the attribute of whenbuilt object
        return houseClone;
    }

    public Object clone() throws CloneNotSupportedException{
        House hc = (House)super.clone();//shallow clone which will only copy built in type data
        hc.whenbuilt = (Date)whenbuilt.clone();

        return hc;

    }

    public int compareTo(House o){
        //(1)
//        if(this.area == o.area){
//            return 0;
//        }else if(this.area > o.area){
//            return 1;
//        }else{
//            return -1;
//        }
        //(2)
//        return this.area > o.area? -1:(this.area < o.area)? 1:0; //between the parathenses is the else if
        //(3)
        return Double.compare(this.area,o.area);
    }

    public boolean equals(Object o){
        if(this == o){
            return true;
        }

        if(o == null || getClass() != o.getClass()){
            return false;
        }

        House that = (House)o;

        return this.id == ((House)o).getId() &&
                this.whenbuilt.equals(((House)o).whenbuilt) &&
                this.area == ((House)o).getArea();
    }
}
