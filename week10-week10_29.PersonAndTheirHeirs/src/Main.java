
import java.util.ArrayList;
import java.util.List;
import people.Person;

public class Main {

    public static void printDepartment(List<Person> people) {
        for (Person person : people) {
            System.out.println(person.toString());
        }
    }

    public static void main(String[] args) {
        Person pekka = new Person("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa");
        Person esko = new Person("Esko Ukkonen", "Mannerheimintie Street 15 00100 Helsinki");
        System.out.println(pekka);
        System.out.println(esko);
    }
    // test your code here

}
