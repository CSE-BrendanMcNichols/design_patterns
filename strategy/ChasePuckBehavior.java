package strategy;
/**
 * @author Brendan McNichols
 * Performs the chase puck behavior
 * @return A string showing that the player is chasing the puck.
 */
public class ChasePuckBehavior implements DefenceBehavior {
    public String play() {
        return "Chases the puck";
    }
}