package personnel;

public class Main {

    public static void main(String[] args) {
      Employees  t = new Employees();
        Person h = new Person("Arto", Education.D);
        t.add(h);
        t.print();
        t.print(Education.D);
    }
}
