import org.w3c.dom.ls.LSOutput;
import static java.lang.String.format;

public class Car {

    private String brand;
    private String model;
    private int horsePower;

    public Car() {

    }

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public Car(String brand, String model, int horsePower) {
        this.brand = brand;
        this.model = model;
        this.horsePower = horsePower;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        if (horsePower == 0)
            return this.brand + ":" + this.model;

            return this.brand + ": " + this.model + ": " + this.horsePower;
        }


    public static void main (String[] args) {
        Car c = new Car("Toyota", "Yaris",100);

        System.out.println(c);
    }

}


