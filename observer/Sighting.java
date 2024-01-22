package observer;
import java.util.ArrayList;
public class Sighting {
    private String location;
    private String details;
    private ArrayList<String> accomplices;

    public Sighting(String location, String details, ArrayList<String> accomplices) {
        this.location = location;
        this.details = details;
        this.accomplices = new ArrayList<>(accomplices);
    }

    public String getLocation() {
        return location;
    }

    public String getDetails() {
        return details;
    }

    public ArrayList<String> getAccomplices() {
        return new ArrayList<>(accomplices);
    }
}