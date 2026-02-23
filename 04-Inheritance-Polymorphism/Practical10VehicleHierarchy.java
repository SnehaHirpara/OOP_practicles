class Vehicle {

    protected String vehicleNumber;
    protected String brand;
    protected String fuelType;

    Vehicle(String v, String b, String f) {
        vehicleNumber = v;
        brand = b;
        fuelType = f;
    }

    void displayDetails() {
        System.out.println("Vehicle Number : " + vehicleNumber);
        System.out.println("Brand          : " + brand);
        System.out.println("Fuel Type      : " + fuelType);
    }
}

class Car extends Vehicle {

    protected int numberOfSeats;
    protected boolean acAvailable;

    Car(String v, String b, String f, int seats, boolean ac) {
        super(v, b, f);
        numberOfSeats = seats;
        acAvailable = ac;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Seats: " + numberOfSeats);
        System.out.println("AC Available   : " + acAvailable);
    }
}

class ElectricCar extends Car {

    private int batteryCapacity;
    private int chargingTime;

    ElectricCar(String v, String b, int seats, boolean ac, int capacity, int time) {
        super(v, b, "Electric", seats, ac);
        batteryCapacity = capacity;
        chargingTime = time;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
        System.out.println("Charging Time   : " + chargingTime + " hours");
    }
}

public class Practical10VehicleHierarchy {

    public static void main(String[] args) {

        // Base object
        Vehicle v1 = new Vehicle("GJ05NA5673", "Hyundai", "Petrol");
        v1.displayDetails();
        System.out.println();

        // Car object
        Car c1 = new Car("GJ05TY5678", "Bentley", "Petrol", 5, true);
        c1.displayDetails();
        System.out.println();

        // Electric Car object
        ElectricCar e1 = new ElectricCar("GJ05EV1234", "Tesla", 5, true, 75, 6);
        e1.displayDetails();
        System.out.println();

        // Upcasting
        Vehicle v2 = new Car("GJ05TY9999", "Audi", "Diesel", 4, true);
        v2.displayDetails();
        System.out.println();

        // Downcasting using instanceof
        if (v2 instanceof Car) {
            Car c2 = (Car) v2;
            System.out.println("Downcasting successful.");
            System.out.println("Seats: " + c2.numberOfSeats);
        }
    }
}