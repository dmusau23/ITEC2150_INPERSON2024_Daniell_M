package PC.BuildMyPC;

/**
 * ASUS - ROG MAXIMUS Z790 HERO (Socket LGA 1700) USB 3.2 Intel Motherboard
 * Model:ROG MAXIMUS Z790 HEROSKU:6523718
 * Form Factor: ATX
 * Processor Socket: Socket LGA 1700
 * Operating System Compatibility: Windows 10, Windows 11 Home
 * Number Of PCI Slots: 6
 * Number Of Memory Slots: 4
 * Maximum Memory Supported: 128 gigabytes
 */
public class Motherboard {
    private String brand;
    private String model;
    private  String socket;
    private String systemCompatibility;
    private int numberOfPciSlots;
    private int numberOfMemorySlots;
    private int memory;
    private String formFactor;

    public Motherboard(String brand, String model, String socket, String systemCompatibility, int numberOfPciSlots, int numberOfMemorySlots, int memory, String formFactor) {
        this.brand = brand;
        this.model = model;
        this.socket = socket;
        this.systemCompatibility = systemCompatibility;
        this.numberOfPciSlots = numberOfPciSlots;
        this.numberOfMemorySlots = numberOfMemorySlots;
        this.memory = memory;
        this.formFactor = formFactor;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }

    public String getSystemCompatibility() {
        return systemCompatibility;
    }

    public void setSystemCompatibility(String systemCompatibility) {
        this.systemCompatibility = systemCompatibility;
    }

    public int getNumberOfPciSlots() {
        return numberOfPciSlots;
    }

    public void setNumberOfPciSlots(int numberOfPciSlots) {
        this.numberOfPciSlots = numberOfPciSlots;
    }

    public int getNumberOfMemorySlots() {
        return numberOfMemorySlots;
    }

    public void setNumberOfMemorySlots(int numberOfMemorySlots) {
        this.numberOfMemorySlots = numberOfMemorySlots;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String getFormFactor() {
        return formFactor;
    }

    public void setFormFactor(String formFactor) {
        this.formFactor = formFactor;
    }

    @Override
    public String toString() {
        return "Motherboard{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", socket='" + socket + '\'' +
                ", systemCompatibility='" + systemCompatibility + '\'' +
                ", numberOfPciSlots=" + numberOfPciSlots +
                ", numberOfMemorySlots=" + numberOfMemorySlots +
                ", memory=" + memory +
                ", formFactor='" + formFactor + '\'' +
                '}';
    }
}
