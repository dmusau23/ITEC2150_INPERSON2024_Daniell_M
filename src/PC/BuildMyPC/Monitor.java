package PC.BuildMyPC;

/**
 * Acer - Nitro XZ320Q P3bmiiphx 31.5”
 * LED Curved FHD FreeSync Premium Monitor - Black
 * Model:XZ320Q P3bmiiphxSKU:6538259
 * maximum resolution: 1920 * 1080
 * screen size 31.5 inches
 * refrehs rate is 165Hz
 */
public class Monitor {

    //manufacturer: String
    //model: String
    //maximum resolution - Resolution
    //screen size : double
    //refresh rate: int

    private String manufacturer;
    private String model;
    private Resolution resolution;
    private double screenSize;
    private int refreshRate;

    public Monitor(String manufacturer, String model, Resolution resolution, double screenSize, int refreshRate) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.resolution = resolution;
        this.screenSize = screenSize;
        this.refreshRate = refreshRate;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", resolution=" + resolution +
                ", screenSize=" + screenSize +
                ", refreshRate=" + refreshRate +
                '}';
    }
}
