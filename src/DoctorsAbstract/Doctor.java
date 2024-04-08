package DoctorsAbstract;

/**
 * add getSchedule method - abstract method
 */
public abstract class Doctor {
    protected String name;

    public Doctor(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public abstract String getSchedule();

}
