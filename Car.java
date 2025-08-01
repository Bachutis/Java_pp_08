public class Car extends Vehicle{

    private  int numberOfDoors;

    public Car(String brand, int numberOfDoors) {
        super(brand); //arg
        this.numberOfDoors = numberOfDoors;
        System.out.println("Car constructor called");

    }

    public void openTruck (){
        System.out.println("The truck is open.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();

        System.out.println("Number of doors: " + this.numberOfDoors);
    }


}
