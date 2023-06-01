class Vehicle {
    protected String brand;
    protected String color;

    public Vehicle(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
    }
}

class Car extends Vehicle {
    private int numDoors;

    public Car(String brand, String color, int numDoors) {
        super(brand, color);
        this.numDoors = numDoors;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of doors: " + numDoors);
    }
}

class Motorcycle extends Vehicle {
    private int numWheels;

    public Motorcycle(String brand, String color, int numWheels) {
        super(brand, color);
        this.numWheels = numWheels;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of wheels: " + numWheels);
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Generic", "Black");
        Car car = new Car("Toyota", "Red", 4);
        Motorcycle motorcycle = new Motorcycle("Honda", "Blue", 2);

        vehicle.displayInfo();
        System.out.println("------------------");
        car.displayInfo();
        System.out.println("------------------");
        motorcycle.displayInfo();
    }
}
