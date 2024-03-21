package src.oop;

public class Employee extends Person {

    public Employee(String name, int age, Gender gender) {
        super(name, age, gender);
    }

    public Employee(String name, int age) {
        super(name, age);
    }

    // Static property and methods are overwritten without !Override() modifer
    public static String getClassName() {
        return "Employee";
    }

    // Instance method requires @Override() modifier
    @Override()
    public String alsoGetClassName() {
        return "Employee";
    }

}
