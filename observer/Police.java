package observer;
import java.util.ArrayList;

public class Police implements Observer {
    private Subject cook;
    private ArrayList<String> locations;
    private StringBuilder notes;
    private ArrayList<String> people;

    public Police(Subject cook) {
        this.cook = cook;
        this.locations = new ArrayList<>();
        this.notes = new StringBuilder();
        this.people = new ArrayList<>();
        cook.registerObserver(this);
    }

    public void update(String location, String description, ArrayList<String> accomplices) {
        locations.add(location);
        notes.append(description).append("\n");
        people.addAll(accomplices);
    }

    public String getLog() {
        StringBuilder log = new StringBuilder();
        log.append("Locations:\n");
        for (String location : locations) {
            log.append("- ").append(location).append("\n");
        }
        log.append("\nNotes:\n").append(notes.toString().trim()).append("\n");
        log.append("\nAccomplices:\n");
        for (String person : people) {
            log.append("- ").append(person).append("\n");
        }
        return log.toString();
    }
}