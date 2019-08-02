
public class Bird {

    private String name;
    private String latinName;
    private int ringingYear;

    public Bird(String name, String latinName, int ringingYear) {
        this.name = name;
        this.latinName = latinName;
        this.ringingYear = ringingYear;

    }

    public String getLatinName() {
        return this.latinName;
    }

    public int obsYear() {
        return this.ringingYear;
    }

    public boolean equals(Object bird) {
        if (bird == null) {
            return false;
        }

        if (getClass() != bird.getClass()) {
            return false;
        }

        Bird compared = (Bird) bird;

        if (!this.getLatinName().equals(compared.getLatinName())) {
            return false;
        }
        if (this.obsYear() != compared.obsYear()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        if (this.ringingYear ==0) {
            return 0;
        }

        return this.getLatinName().hashCode();
    }

    @Override
    public String toString() {
        return this.latinName + " (" + this.ringingYear + ")";
    }
}
