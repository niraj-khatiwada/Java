package OOP;

public class Vehicle {
    private String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getName(String newName) {
        return newName;
    }

    protected int getAge() {
        return 1;
    }

    public static String signature = "Vehicle";

    public static String getMyName() {
        return Vehicle.signature;
    }
}
