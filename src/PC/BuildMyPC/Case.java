package PC.BuildMyPC;

/**
 * CORSAIR - 4000D AIRFLOW ATX MidTower Case - Black
 * Product Height 18.35 inches
 * Product Width 9.06 inches
 * Product Depth 17.83 inches
 * Case Material Steel, Glass, Plastic
 */
public class Case {

    private String model;
    private String brand;
    private String material;
    private Dimension dimension;

    public Case(String model, String brand, String material, Dimension dimension) {
        this.model = model;
        this.brand = brand;
        this.material = material;
        this.dimension = dimension;
    }

    public void pressPowerButton(){
        System.out.println("Case Class: Press the power button - Pressed ");
    }

    @Override
    public String toString() {
        return "Case{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", material='" + material + '\'' +
                ", dimension=" + dimension +
                '}';
    }
}
