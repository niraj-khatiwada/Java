package src.oop;

interface IPerson {
    String getName();

    String getName(String name);

    int getAge();

    Gender getGender();
}

public class Person implements IPerson {
    private String name;
    private int age;
    private Gender gender;

    public static String id = "ID";

    public Person(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.gender = Gender.Not_Answered;
    }

    @Override()
    public String getName() {
        return this.name;
    }

    // Method overloading
    @Override()
    public String getName(String extraName) {
        return this.name + extraName;
    }

    @Override()
    public int getAge() {
        return this.age;
    }

    @Override()
    public Gender getGender() {
        return this.gender;
    }

    public static String getClassName() {
        return "Person";
    }

    public String alsoGetClassName() {
        return "Person";
    }

}

// Paste this in main.java
// package src;

// import src.oop.Employee;
// import src.oop.Gender;
// import src.oop.Person;

// class Main {
// public static void main(String[] args) {
// Person person = new Person("Niraj", 27, Gender.Male);
// System.out.println(person.getName());
// System.out.println(person.getName(" Khatiwada"));
// System.out.println(person.getAge());
// System.out.println(person.getGender());
// System.out.println(Person.id);

// var person2 = new Person("Unknown", 18);
// System.out.println(person.getName());
// System.out.println(person.getAge());
// System.out.println(person2.getGender());

// System.out.println(Person.getClassName());

// var employee = new Employee("Niraj", 27, Gender.Male);
// System.out.println(employee.getName());
// System.out.println(employee.getAge());
// System.out.println(employee.getGender());
// System.out.println(Employee.getClassName());
// System.out.println(employee.alsoGetClassName());
// }
// }
