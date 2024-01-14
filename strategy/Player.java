package strategy;
import java.util.Random;
public abstract class Player {
    protected String firstName;
    protected String lastName;
    protected DefenceBehavior defenceBehavior;
    protected OffenceBehavior offenceBehavior;
    protected Random rand;

    public Player(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.rand = new Random();
    }

    public abstract String play(boolean possession);

    public void setDefenceBehavior(DefenceBehavior defenceBehavior) {
        this.defenceBehavior = defenceBehavior;
    }

    public void setOffenceBehavior(OffenceBehavior offenceBehavior) {
        this.offenceBehavior = offenceBehavior;
    }

    public String toString() {
        return firstName + " " + lastName;
    }
}