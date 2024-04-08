package DoctorsAbstract;

public class Cardiologist extends Doctor{

    public Cardiologist(String name) {
        super(name);
    }

    public String getSchedule(){
        return "M,W,F - 9am to 6pm";
    }
}
