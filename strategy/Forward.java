package strategy;
import java.util.Random;
public class Forward extends Player {

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

    public void setOffenceBehavior(OffenceBehavior offenceBehavior) {
        this.offenceBehavior = offenceBehavior;
    }

    public void setDefenceBehavior(DefenceBehavior defenceBehavior) {
        this.defenceBehavior = defenceBehavior;
    }

    public String play(boolean hasPossession) {
        updateBehaviors();
        return offenceBehavior.play();
    }

    public String toString() {
        return super.toString() + " - plays the position: Forward";
    }
}
