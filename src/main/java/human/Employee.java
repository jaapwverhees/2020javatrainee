package human;

public class Employee extends Person {

    public Employee() {
    }

    public Employee(String name, int age) {
        super(name, age);
    }

    public Employee(String name, int age, Gender gender) {
        super(name, age, gender);
    }

    @Override
    public String greeting() {
        return "Worker of the world, Unite!";
    }
}
