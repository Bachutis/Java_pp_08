import java.sql.SQLOutput;

public class Vehicle {

    protected String brand;

    // Constructor method
    public Vehicle(String brand) {
        this.brand = brand; // bmwr
        System.out.println("Vehicle constructor called...");
    }

    public void honk() {
        System.out.println("Beep, Beep..");
    }
    public void displayInfo () {
        System.out.println("Vehicle brand:" + this.brand);
    }

}
