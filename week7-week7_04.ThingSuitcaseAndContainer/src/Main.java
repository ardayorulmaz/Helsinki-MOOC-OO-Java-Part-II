
public class Main {

    public static void main(String[] Container) {
        Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);
    }

    public static void addSuitcasesFullOfBricks(Container container) {

        for (int i = 1; i < 100; i++) {

            Thing brick = new Thing("bricky", i);
            Suitcase suitcase = new Suitcase(i);
            suitcase.addThing(brick);
            container.addSuitcase(suitcase);
        }

    }
}
