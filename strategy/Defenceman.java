package strategy;
import java.util.Random;
/**
 * @author Brendan McNichols
 * Represents the position of Defence in a hockey game
 */
public class Defenceman extends Player {
    /**
     * @param firstName The first name of the Defenceman.
     * @param lastName The last name of the Defenceman.
     */
    public Defenceman(String firstName, String lastName) {
        super(firstName, lastName);
        updateBehaviors();
    }

    private void updateBehaviors() {
        if (new Random().nextInt(10) < 9) {
            offenceBehavior = new PassBehavior();
        } else {
            offenceBehavior = new SlapShotBehavior();
        }

        if (new Random().nextBoolean()) {
            defenceBehavior = new ChasePuckBehavior();
        } else {
            defenceBehavior = new BlockBehavior();
        }
    }
/**
     * Performs the offensive action based on the current offence behavior.
     * Updates behaviors before playing.
     * @param hasPossession A boolean indicating whether the team has possession of the puck.
     * @return A string representing the specific offensive action.
     */
    public String play(boolean hasPossession) {
        updateBehaviors();
        return offenceBehavior.play();
    }
/**
 * @return A string indicating the first name, last name, and position of the defenceman.
 */
    public String toString() {
        return super.toString() + " plays the position: Defenceman";
    }
}
