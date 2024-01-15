package strategy;
import java.util.Random;
/**
 * @author Brendan McNichols
 * Represents the position of forward in a hockey game
 */
public class Forward extends Player {
/**
     * Constructs a new forward with the given first name and last name.
     * @param firstName The first name of the forward.
     * @param lastName  The last name of the forward.
     */
    public Forward(String firstName, String lastName) {
        super(firstName, lastName);
        updateBehaviors();
    }

    private void updateBehaviors() {
        if (new Random().nextBoolean()) {
            setOffenceBehavior(new PassBehavior());
        } else {
            setOffenceBehavior(new ShootBehavior());
        }

        if (new Random().nextBoolean()) {
            setDefenceBehavior(new ChasePuckBehavior());
        } else {
            setDefenceBehavior(new BlockBehavior());
        }
    }
 /**
     * Sets the offensive behavior for the forward.
     * @param offenceBehavior The offensive behavior to be set.
     */
    public void setOffenceBehavior(OffenceBehavior offenceBehavior) {
        this.offenceBehavior = offenceBehavior;
    }
/**
     * Sets the defensive behavior for the forward.
     * @param defenceBehavior The defensive behavior to be set.
     */
    public void setDefenceBehavior(DefenceBehavior defenceBehavior) {
        this.defenceBehavior = defenceBehavior;
    }
/**
     * Performs the offensive action based on the current offence behavior.
     * Updates behaviors before playing.
     * @param hasPossession A boolean indicating whether the team has possession of the puck or not.
     * @return A string representing the specific offensive action.
     */
    public String play(boolean hasPossession) {
        updateBehaviors();
        return offenceBehavior.play();
    }
/**
 * @return A string indicating the first name, last name, and position of the forward.
 */
    public String toString() {
        return super.toString() + " plays the position: Forward";
    }
}
