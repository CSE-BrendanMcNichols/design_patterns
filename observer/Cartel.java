package observer;

import java.util.ArrayList;
class Cartel implements Observer {
    private Subject cook;
    private ArrayList<Sighting> sightings;

    public Cartel(Subject cook) {
        this.cook = cook;
        this.sightings = new ArrayList<>();
        cook.registerObserver(this);
    }

    public void update(String location, String description, ArrayList<String> accomplices) {
        sightings.add(new Sighting(location, description, accomplices));
    }

    public String getLog() {
        StringBuilder log = new StringBuilder();
        for (Sighting sighting : sightings) {
            log.append(sighting.getLocation()).append(" (").append(sighting.getDetails()).append("), with ")
                    .append(String.join(", ", sighting.getAccomplices())).append("\n");
        }
        return log.toString();
    }
}
