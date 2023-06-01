abstract class Vehicle {
    protected String brand;
    protected String color;

    public Vehicle(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public abstract void displayInfo();
}

class Car extends Vehicle {
    private int numDoors;

    public Car(String brand, String color, int numDoors) {
        super(brand, color);
        this.numDoors = numDoors;
    }

    @Override
    public void displayInfo() {
        System.out.println("Car - Brand: " + brand);
        System.out.println("Car - Color: " + color);
        System.out.println("Car - Number of doors: " + numDoors);
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", "Red", 4);
        Vehicle motorcycle = new Motorcycle("Honda", "Blue", 2);

        car.displayInfo();
    }
}
