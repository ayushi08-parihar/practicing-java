import java.util.Scanner;

// Interface
interface FuelType {
    void fuelEfficiency();
}

// Abstract class
abstract class Vehicle {
    abstract void startEngine();
}

// Car subclass
class Car extends Vehicle implements FuelType {

    public double efficiency;

    Car(double efficiency) {
        this.efficiency = efficiency;
    }

   // @Override
    void startEngine() {
        System.out.println("Car engine starts with a key ignition.");
    }

    //@Override
    public void fuelEfficiency() {
        System.out.println("Car Fuel Efficiency: " + efficiency + " km/l");
    }
}

// Bike subclass
class Bike extends Vehicle implements FuelType {

    public double efficiency;

    Bike(double efficiency) {
        this.efficiency = efficiency;
    }

   // @Override
    void startEngine() {
        System.out.println("Bike engine starts with a self-start button.");
    }

   // @Override
    public void fuelEfficiency() {
        System.out.println("Bike Fuel Efficiency: " + efficiency + " km/l");
    }
}

// Main class
public class Abstract {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter Car Fuel Efficiency (km/l): ");
        double carEff = sc.nextDouble();

        System.out.print("Enter Bike Fuel Efficiency (km/l): ");
        double bikeEff = sc.nextDouble();

        Car car = new Car(carEff);
        Bike bike = new Bike(bikeEff);

        car.startEngine();
        car.fuelEfficiency();

       System.out.println("---------------------------");
        bike.startEngine();
        bike.fuelEfficiency();

        sc.close();
    }
}