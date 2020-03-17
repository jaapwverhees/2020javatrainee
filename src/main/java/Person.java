import java.util.Calendar;

public class Person {
    public static int numberOfPossibleGenders = 3;
    String name;
    int age;
    Gender gender;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.gender = Gender.UNKNOWN;
    }

    public Person(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setage(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void haveBirthday() {
        age += 1;
    }

    @Override
    public String toString(){
        return String.format("%s (%s) is %s", getName(), getAge(),getGender());
    }
    public boolean equals(Person person){
     return((getName().equals(person.getName())) && (getAge() == person.getAge()) && getGender() == person.getGender());
    }

    public int hashcode(){
        return age * name.hashCode() * gender.hashCode();
    }
}
