import java.util.*;

class Vehicle {
    private String brand;
    private String model;
    private float distanceTraveled;
    private float fuelUsed;

    public Vehicle(String brand, String model, float distanceTraveled, float fuelUsed) {
        this.brand = brand;
        this.model = model;
        this.distanceTraveled = distanceTraveled;
        this.fuelUsed = fuelUsed;
    }

    // getters
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public float getDistanceTraveled() {
        return distanceTraveled;
    }
    public float getFuelUsed() {
        return fuelUsed;
    }
    public float getFuelEfficiency() {
        return distanceTraveled / fuelUsed;
    }
    public void displayInfo() {
        System.out.println("Vehicle: " + getBrand() + " " + getModel());
        System.out.println("Distance Traveled: " + getDistanceTraveled() + " km");
        System.out.println("Fuel Efficiency: " + getFuelEfficiency() + " km/l\n");
    }

}

class Car extends Vehicle {

    Car(String brand, String model, float distanceTraveled, float fuelUsed) {
        super(brand, model, distanceTraveled, fuelUsed);
    }
    
}

class Bike extends Vehicle {

    Bike(String brand, String model, float distanceTraveled) {
        super(brand, model, distanceTraveled, 0);
    }

    @Override
    public void displayInfo() {
        System.out.println("Vehicle: " + getBrand() + " " + getModel());
        System.out.println("Distance Traveled: " + getDistanceTraveled()+ " km\n");
    }

}

class Truck extends Car {

    Truck(String brand, String model, float distanceTraveled, float fuelUsed) {
        super(brand, model, distanceTraveled, fuelUsed);
    }

}

class InputHandler {
    Scanner scanner = new Scanner(System.in);

    // input handler for string
    public String getString(String text) {
        while (true) {
            System.out.print(text);
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                System.out.println("Error: Input cannot be blank.");
                continue;
            }
            return input;
        }
    }

    // input handler for float
    public float getFloat(String text) {
        while (true) {
            // get input through string first then convert it to float input
            try {
                float floatInput = Float.parseFloat(getString(text));
                if (floatInput > 1) {
                    return floatInput;
                }
                System.out.println("Error: Input must be greater than 0.");
            }
            catch(Exception e) {
                System.out.println("Error: Incorrect input.");
            }
        }
    }
}

void main() {
    InputHandler input = new InputHandler();

    System.out.println("Enter details for a Car:");
    Car myCar = new Car(input.getString("Brand: "), input.getString("Model: "), input.getFloat("Distance Traveled (km): "), input.getFloat("Fuel Used (liters): "));

    System.out.println("\nEnter details for a Bike:");
    Bike myBike = new Bike(input.getString("Brand: "), input.getString("Model: "), input.getFloat("Distance Traveled (km): "));

    System.out.println("\nEnter details for a Truck:");
    Truck myTruck = new Truck(input.getString("Brand: "), input.getString("Model: "), input.getFloat("Distance Traveled (km): "), input.getFloat("Fuel Used (liters): "));

    System.out.println("\n--- Vehicle Summary ---");
    myCar.displayInfo();
    myBike.displayInfo();
    myTruck.displayInfo();
}