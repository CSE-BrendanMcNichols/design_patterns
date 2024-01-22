package observer;
import java.util.ArrayList;
public class Sighting {
    private String location;
    private String details;
    private ArrayList<String> accomplices;
    /**
     * 
     * @param location location of sighting
     * @param details details of sighting
     * @param accomplices accomplices that were seen during sighting 
     */
    public Sighting(String location, String details, ArrayList<String> accomplices) {
        this.location = location;
        this.details = details;
        this.accomplices = new ArrayList<>(accomplices);
    }
/**
 * get location
 * @return the location of sighting
 */
    public String getLocation() {
        return location;
    }
/**
 * get details
 * @return the details of the sighting
 */
    public String getDetails() {
        return details;
    }
/**
 * get accomplice 
 * @return the accomplices seen at the sighting
 */
    public ArrayList<String> getAccomplices() {
        return new ArrayList<>(accomplices);
    }
}