
abstract class Vehicle {
    private String make;
    private String model;
    private double rentalRate;

    public Vehicle(String make, String model, double rentalRate) {
        this.make = make;
        this.model = model;
        this.rentalRate = rentalRate;
    }
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public double getRentalRate() {
        return rentalRate;
    }
    public abstract double calculateRentalCost(int days);

    public abstract void displayVehicleInfo();
}

class Car extends Vehicle {
    public Car(String make, String model, double rentalRate) {
        super(make, model, rentalRate);
    }

    public double calculateRentalCost(int days) {
        return days * getRentalRate();
    }
    public void displayVehicleInfo() {
        System.out.println("Car: " + getMake() + " " + getModel() + " | Rate: $" + getRentalRate() + " per day");
    }
}
class Bike extends Vehicle {
    public Bike(String make, String model, double rentalRate) {
        super(make, model, rentalRate);
    }
    public double calculateRentalCost(int days) {
        double cost = days * getRentalRate();
        if (days > 5) {
            cost *= 0.9;
        }
        return cost;
    }

    @Override
    public void displayVehicleInfo() {
        System.out.println("Bike: " + getMake() + " " + getModel() + " | Rate: $" + getRentalRate() + " per day");
    }
}
public class task04 {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", "Camry", 50.0);
        Vehicle bike = new Bike("Yamaha", "MT-15", 20.0);

        car.displayVehicleInfo();
        System.out.println("Rental cost for 3 days: $" + car.calculateRentalCost(3));
        System.out.println();

        bike.displayVehicleInfo();
        System.out.println("Rental cost for 7 days: $" + bike.calculateRentalCost(7));
    }
}
