
import java.lang.String;
import OOP.Vehicle;

class Main {
    public static void main(String[] args) {
        var vehicle = new Vehicle("Niraj");
        System.out.println(vehicle.getName("NK"));
        System.out.println(Vehicle.signature);
        System.out.println(Vehicle.getMyName());
    }
}
