package PC.BuildMyPC;

public class Tester {
    public static void main(String[] args) {
        Dimension dimension = new Dimension(18.35,9.06,17.83);
        Case myCase = new Case("4000D AIRFLOW ATX MidTower Case","CORSAIR","Steel, Glass, Plastic",dimension);
        Resolution resolution = new Resolution(1920,1080);
        Monitor monitor = new Monitor("HP","M27h",resolution,27,75);
        Motherboard motherboard = new Motherboard("MSI","B550GPLUS","Socket AM4 (PGA 1331)","Windows 10, Windows 11 Home, Windows 11 Pro",4,4,128,"ATX");
        PC computer = new PC(myCase,monitor,motherboard);

        System.out.println(computer);
    }
}
