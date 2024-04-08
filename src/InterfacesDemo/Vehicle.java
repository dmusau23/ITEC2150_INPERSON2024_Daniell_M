package InterfacesDemo;

/**
 * create multiple abstract methods in vehicle interface
 */
public interface Vehicle {
    public abstract void start();
    abstract void stop();
    void forward();
    void reverse();
    void turnToLeft();
    public void turnToRight();
}
