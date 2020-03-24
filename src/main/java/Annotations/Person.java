package Annotations;

@MyAnnotation.JsonSerializable
public class Person {
    @MyAnnotation.JsonElement(key = "firstname")
    private String firstName;

    @MyAnnotation.JsonElement(key = "lastname")
    private String lastName;


    @MyAnnotation.JsonElement(key = "age")
    private int age;


    @MyAnnotation.Init
    private void initNames() {
        this.firstName = this.firstName.substring(0, 1).toUpperCase()
                + this.firstName.substring(1);
        this.lastName = this.lastName.substring(0, 1).toUpperCase()
                + this.lastName.substring(1);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
