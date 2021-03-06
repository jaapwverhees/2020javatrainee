package human;

public class Person extends Human {
    public static int numberOfPossibleGenders = 3;
    private String name;
    private int age;
    private Gender gender;
    //opdracht is onduidelijk omtrent dit deel
    //ik zou hier een list van maken, maar opdracht
    private HistoryRecord historyRecords;

    public Person() {
        this.historyRecords = new HistoryRecord();
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.gender = Gender.UNKNOWN;
        this.historyRecords = new HistoryRecord();
    }

    public Person(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.historyRecords = new HistoryRecord();
    }

    public Person(String name, int age, Gender gender, HistoryRecord historyRecords) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.historyRecords = historyRecords;
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

    public HistoryRecord getHistoryRecords() {
        return historyRecords;
    }

    public Human subHuman(){
        Human human = new Human() {

            @Override
            public String greeting() {
                return "There are no subhumans, everybody is equal";
            }
        };
        return human;
    }

    //ik had dit zelf anders gedaan maar opdracht
    public void addHistory(String description) throws Exception {

        if(!this.historyRecords.addDescription(description)){
            throw new Exception("Array full");
        }
    }

    @Override
    public String toString() {
        return String.format("%s (%s) is %s", getName(), getAge(), getGender());
    }


    public boolean equals(Person person) {
        return ((getName().equals(person.getName())) && (getAge() == person.getAge()) && getGender() == person.getGender());
    }

    public int hashcode() {
        return age * name.hashCode() * gender.hashCode();
    }

    @Override
    public String greeting() {
        return String.format("Hello, my name is %s", this.name);
    }
}
