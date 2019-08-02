package boxes;

public class Thing extends Box {

    private String name;
    private int weight;

    public Thing(String name, int weight) {

        this.name = name;
        if (weight < 0) {
            throw new IllegalArgumentException("Weight is below zero");
        }
        this.weight = weight;

    }

    public Thing(String name) {
        this(name, 0);
    }

    public String getName() {
        return this.name;
    }

    public int getWeight() {
        return this.weight;
    }

    @Override
    public int hashCode() {
        
        return this.getName().hashCode();
    }

    public boolean equals(Object thing) {
        if (thing == null) {
            return false;
        }

        if (getClass() != thing.getClass()) {
            return false;
        }

        Thing compared = (Thing) thing;

        if (!this.getName().equals(compared.getName())) {
            return false;
        }
       
        return true;
    }

    @Override

    public void add(Thing thing) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
