package InterfacesDemo;

public class VehicleTester {
    public static void main(String[] args) {
        Vehicle c1 = new Car();
        Vehicle b1 = new Bike();

        c1.forward();
        c1.reverse();

        b1.reverse();
        b1.start();

    }
}
