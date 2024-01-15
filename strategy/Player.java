package strategy;
import java.util.Random;
public abstract class Player {
    protected String firstName;
    protected String lastName;
    protected DefenceBehavior defenceBehavior;
    protected OffenceBehavior offenceBehavior;
    protected Random rand;
/**
     * Constructs a new player first name and last name.
     * @param firstName The first name of the player.
     * @param lastName  The last name of the player.
     */
    public Player(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.rand = new Random();
    }

    public abstract String play(boolean possession);
/**
     * Sets the defensive behavior for the player.
     * @param defenceBehavior The defensive behavior to be set.
     */
    public void setDefenceBehavior(DefenceBehavior defenceBehavior) {
        this.defenceBehavior = defenceBehavior;
    }
/**
     * Sets the offensive behavior for the player.
     * @param offenceBehavior The offensive behavior to be set.
     */
    public void setOffenceBehavior(OffenceBehavior offenceBehavior) {
        this.offenceBehavior = offenceBehavior;
    }
/**
     * @return A string indicating the first name and last name of the player.
     */
    public String toString() {
        return firstName + " " + lastName;
    }
}