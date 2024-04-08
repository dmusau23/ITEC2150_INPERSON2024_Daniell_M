package DoctorsAbstract;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DoctorScheduling {
    static List<Doctor> doctors = new ArrayList<Doctor>();
    public static void main(String[] args) {
        //create a menu to select a few of items
        //ask to check about a specific doctor
        //ask about schedule of the doctors



    }

    public static void addDoctor(Scanner input){
        System.out.print("Enter the doctor's name: ");
        String name = input.nextLine();
        /**
         * you will have another menu for specialization area of each doctor
         * 1.Oncology
         * 2.Cardiologist
         * 3.Dermatologist
         */
        System.out.println("Choose doctor's specialization");
        System.out.println("1.Oncology\n" +
                "2.Cardiologist\n" +
                "3.Dermatologist");
        int specialization = input.nextInt();

        switch (specialization){
            case 1:
                doctors.add(new Oncologist(name));
                break;
            case 2:
                doctors.add(new Cardiologist(name));
                break;
            case 3:
                doctors.add(new Dermatologist(name));
                break;
            default:
                System.out.println("Invalid input - error");
        }
    }

    public static void viewSchedule(){
        if(doctors.isEmpty()){
            System.out.println("No doctors has been added yet");
        }

        for(Doctor doc: doctors){
            System.out.println(doc.getName() +" - " +doc.getSchedule());
        }
    }
}
