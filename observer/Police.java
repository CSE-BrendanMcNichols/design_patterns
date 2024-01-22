package observer;
import java.util.ArrayList;
/*
 * @author Brendan McNichols
 * Class representing police
 */
public class Police implements Observer {
    private ArrayList<String> locations;
    private StringBuilder notes;
    private ArrayList<String> people;
/**
 * 
 * @param cook Cook to observe
 */
    public Police(Subject cook) {
        this.locations = new ArrayList<>();
        this.notes = new StringBuilder();
        this.people = new ArrayList<>();
        cook.registerObserver(this);
    }

    public void update(String location, String description, ArrayList<String> accomplices) {
        locations.add(location);
        notes.append(description).append("\n");
        
        for (String accomplice : accomplices) {
            if (!people.contains(accomplice)) {
                people.add(accomplice);
            }
        }
    }

    public String getLog() {
        String log = "Locations:\n";
        for (String location : locations) {
            log += "- " + location + "\n";
        }
    
        log += "\nNotes:\n";
        for (String note : notes.toString().trim().split("\n")) {
            log += "- " + note + "\n";
        }
    
        log += "\nAccomplices:\n";
        for (String person : people) {
            log += "- " + person + "\n";
        }

        return log;
    }  
}