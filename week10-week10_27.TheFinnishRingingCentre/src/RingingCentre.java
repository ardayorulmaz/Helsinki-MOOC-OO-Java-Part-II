
import java.util.*;

public class RingingCentre {

    private Map<Bird, List<String>> birdplaces;

    public RingingCentre() {
        this.birdplaces = new HashMap<Bird, List<String>>();
    }

    public void observe(Bird bird, String place) {
        if (!this.birdplaces.keySet().contains(bird)) {
            this.birdplaces.put(bird, new ArrayList<String>());
        }
        this.birdplaces.get(bird).add(place);

    }

    public void observations(Bird bird) {

        if (this.birdplaces.keySet().contains(bird)) {
            System.out.println(bird + " observations: " + this.birdplaces.get(bird).size());
            for (String string : this.birdplaces.get(bird)) {
                System.out.println(string);

            }

        } else {
            System.out.println(bird + " observations: 0");
        }

    }

}
