package observer;
import java.util.ArrayList;
/**
 * @author Brendan McNichols
 * Interface for subject that can be observed
 */
public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers(String location, String description, ArrayList<String> accomplices);
}