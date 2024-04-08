package InterfacesDemo.Game;

import java.util.ArrayList;
import java.util.Scanner;

public class GameUI {
    public static void main(String[] args) {
        King k1 = new King("Henry the King",2,"one at a time in any direction","Black");
        Queen q1 = new Queen("Elisabeth",6,"any direction as far","White");

        saveObject(k1);
        saveObject(q1);
        k1.compareTo(q1);



    }

//    public static void checkPoints(King a, Queen b){
//        if (a.getPoints() > b.getPoints()){
//            System.out.println(a.getName() +" has more points than " +b.getName());
//        }else if(a.getPoints() < b.getPoints()){
//            System.out.println(b.getName() +" has more points than " +a.getName());
//        }else{
//            System.out.println("They all have equal points!");
//        }
//    }

    public static void saveObject(ISavable isobj){
        //use a for loop to iterate date by index value
        for(int i = 0; i< isobj.write().size();i++) {
            System.out.println(isobj.write().get(i));
        }
    }

    public static ArrayList<String> readValues(){
        ArrayList<String> values = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose one string value: ");

        //1 or 0 .. 1 is for entering some string value 0 for exit
        while(scanner.nextInt() !=0){
            if(scanner.nextInt() == 1){
                values.add(scanner.nextLine());
            }else{
                System.exit(0);
            }
        }

        return values;
    }

    public static void loading(ISavable isobj){
        ArrayList<String> chris = readValues();
        isobj.read(chris);

    }
}
