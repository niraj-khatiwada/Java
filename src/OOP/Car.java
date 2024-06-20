package OOP;

public class Car extends Vehicle {
    public Car(String name) {
        super(name);
    }

    public void methodSpecificToCar() {
        System.out.println("methodSpecificToCar");
        this.getAge();
    }

    @Override()
    protected int getAge() {
        return 2;
    }

}
