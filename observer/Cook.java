package observer;
import java.util.ArrayList;
/**
 * Class representing Cook 
 * @author Brendan McNichols
 */
public class Cook implements Subject {
    private ArrayList<Observer> observers;
    private String name;
/**
 * Constructor for the cook class
 * @param name
 */
    public Cook(String name) {
        this.observers = new ArrayList<>();
        this.name = name;
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String location, String description, ArrayList<String> accomplices) {
        for (Observer observer : observers) {
            observer.update(location, description, accomplices);
        }
    }
/**
 * Sighting event and notify observers
 * @param location
 * @param description
 * @param accomplices
 */
    public void enterSighting(String location, String description, String accomplices) {
        Sighting sighting = new Sighting(location, description, parseAccomplices(accomplices));
        notifyObservers(sighting.getLocation(), sighting.getDetails(), sighting.getAccomplices());
    }

    private ArrayList<String> parseAccomplices(String accomplices) {
        String[] accompliceArray = accomplices.split(",");
        ArrayList<String> accompliceList = new ArrayList<>();
        for (String accomplice : accompliceArray) {
            accompliceList.add(accomplice.trim());
        }
        return accompliceList;
    }
/**
 * get name of the cook
 * @return name of the cook
 */
    public String getName() {
        return name;
    }
}
