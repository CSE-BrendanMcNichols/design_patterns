package observer;
import java.util.ArrayList;
/**
 * @author Brendan McNichols
 * Interface for observer that is updated through subject
 */
public interface Observer {
    public void update(String location, String description, ArrayList<String> accomplices);
    public String getLog();
}