package boxes;

public class Main {

    public static void main(String[] args) {
        Thing eka = new Thing("Kivi", 5);
        Thing toka = new Thing("Kivi", 1);
        if (eka.hashCode() == toka.hashCode()) {
            System.out.println("true");
        } else {
            System.out.println("False");
        }
    }
}
