package l1.task1;

public class Main {
    public static void main(String[] args) {
        Person person = new Person.Builder().country("Rus").build();
        System.out.println(person.getCountry() + " " + person.getAddress());
    }
}
