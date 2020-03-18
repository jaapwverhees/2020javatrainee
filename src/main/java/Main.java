import human.Person;

public class Main {

    public static void main(String[] args) {
        Person person = new Person();
        int counter = 0;
        for (int i = 0; i < 13; i++) {
            try {
                person.addHistory("hello" + i);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                break;
            }
        }
    }
}


