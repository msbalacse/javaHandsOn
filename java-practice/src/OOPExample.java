// Define the Vehicle class (Abstraction)
abstract class Vehicle {
    private String brand;
    private int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public abstract void start(); // Abstract method

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}

// Define a Car class (Inheritance)
class Car extends Vehicle {
    private int doors;

    public Car(String brand, int year, int doors) {
        super(brand, year);
        this.doors = doors;
    }

    @Override
    public void start() {
        System.out.println("Starting the car...");
    }

    public void openDoors() {
        System.out.println("Opening " + doors + " doors.");
    }
}

// Define a Bicycle class (Inheritance)
class Bicycle extends Vehicle {
    public Bicycle(String brand, int year) {
        super(brand, year);
    }

    @Override
    public void start() {
        System.out.println("Pedaling the bicycle...");
    }
}

// Main class
public class OOPExample {
    public static void main(String[] args) {
        // Polymorphism example
        Vehicle vehicle1 = new Car("Toyota", 2020, 4);
        Vehicle vehicle2 = new Bicycle("Trek", 2022);

        // Encapsulation and Abstraction example
        vehicle1.displayInfo();
        vehicle1.start();
        if (vehicle1 instanceof Car) {
            ((Car) vehicle1).openDoors();
        }
        System.out.println();

        vehicle2.displayInfo();
        vehicle2.start();
    }
}
